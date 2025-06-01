import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String [] args){
        Map<String, Double> scores = new TreeMap<>();
        scores.put("Mimi",50.43);
        scores.put("Layla",89.0);
        scores.put("Injang",23.9);

        scores.remove("key");
        scores.remove("key",0);

        scores.compute("Layla", (o,n)->n+10);
        scores.computeIfAbsent("Alice",(v)->{
            System.out.print("[+] Insert score:");
            double math = new Scanner(System.in).nextDouble();
            System.out.print("[+] Insert score:");
            double eng = new Scanner(System.in).nextDouble();
            return (math+eng)/2;
        });
        scores.computeIfPresent("lay",(k,v)->{
            return v+100;
        });

        List<String> values = scores.entrySet().stream().filter(e->e.getValue()>=50).map(e->e.getKey()+": Pass").toList();
        List<String> result = scores.entrySet()
                .stream()
                .map(e->e.getValue()>=50 ? e.getKey()+ " :" + e.getValue()+ ": Pass"
                        :e.getKey() + " :" + e.getValue()+": Failed")
                .toList();
        System.out.println(values);
        System.out.println(result);
    }
}
