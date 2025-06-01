package abstraction;

public class main {
    public static void main(String[] args){
        Services s1 = new ServiceImp();
        s1.getAllUser();
        ServiceImp s2 = new ServiceImp();
        s2.getAllUser();
        s2.run();
    }
}
