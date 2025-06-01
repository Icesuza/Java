@java.lang.FunctionalInterface
interface Operate{
    void calculate(int a, int b);
}
class Cal{
    public static void sum(int a, int b, Operate operation){
        operation.calculate(a,b);
    }
    public static void sub(int a, int b, Operate operation){
        operation.calculate(a,b);
    }
}

public class FunctionalInterface {
    public static void main(String[] args){
        Operate operation = (a,b)->{
            System.out.println("Sum: "+ (a+b));
        };
        Cal.sum(5,7,operation);
        Operate operate = (x,y)->{
            System.out.println("Substract: "+(x-y));
        };
        Cal.sub(200,130,operate);
    }
}
