class Calculate{
    public static <T extends Number> Number sum(T a, T b){
        return a.doubleValue()+b.doubleValue();
    }
}
public class TestSum {
    public static void main (String[] args){
        Number num1 = Calculate.sum(3,4);
        Number num2 = Calculate.sum(4.2,7.8);
        System.out.println("Result num1: "+num1);
        System.out.println("Result num2: "+num2);
    }
}
