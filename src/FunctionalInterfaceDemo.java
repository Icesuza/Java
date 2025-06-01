import java.lang.FunctionalInterface;

@FunctionalInterface
interface Loop <T>{
    void process(T [] objects);
}
class ArrayPrint<T>{
    private T[]strings;
    public void foreach(Loop <T> loop){
        loop.process(strings);
    }
    public void setArray(T [] strings){
        this.strings = strings;
    }
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args){
        String[] names = {"mimi","nini","cc","yoongi"};
        ArrayPrint<String>arrayPrint = new ArrayPrint<>();
        arrayPrint.setArray(names);
        arrayPrint.foreach((e)->{
            for(String s:e){
                System.out.println(s);
            }
        });
    }
}
