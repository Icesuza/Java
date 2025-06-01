import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
class BankingException extends Exception {
    public BankingException(String message){
        super(message);
    }
}

public class MapDemo {
    public static void main(String[] args){
//        Map<Integer, String> mp = Map.of(1,"mimi",2,"mina"); //read only
//        Map<Integer, String> map = new HashMap<>
//                (Map.of(1,"Jungkook",2,"Jin"));
//        System.out.println(map);
//        map.put(3,"RM");
//        map.put(4,"Suga");
//        System.out.println(map);
//        map.remove(2);
//        System.out.println(map);
//
//        Collection<String> values = map.values();
//        Set<Integer> keys = map.keySet();
//        boolean isContainKey = map.containsKey(3);
//        boolean isContainValue = map.containsValue("Jhope");
//
//        for (Map.Entry<Integer,String>m:map.entrySet()){
//            System.out.println("Key:"+m.getKey()+" Value:"+m.getValue());
//        }
//        map.forEach((k,v)-> System.out.println("Key:"+k+" Value:"+v));

        Map<String, Long> account = new HashMap<>();
        BiFunction<Long, Long, Long>deposite = (oldValue, newValue)->{return oldValue + newValue;};
        BiFunction<Long, Long, Long>withdraw = (oldValue, newValue)->{
            if (newValue > oldValue) {
                try{
                    throw new BankingException("Balance is not Enough");
                }catch (BankingException e){
                    throw new RuntimeException(e);
                }
            }
            return oldValue - newValue;};
        account.put("004558065",200L);
        account.merge("004558065",300L,deposite);
        account.merge("004558065",100L,withdraw);
        System.out.println(account);
    }
}
