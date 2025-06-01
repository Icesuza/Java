public class RecursiveMethod {
    static int fac(int n){
        if(n==0){
            return 1;
        }
        return n* fac(n-1);
    }
    static int sum(int a){
        if(a==0){
            return 0;
        }
        return a+sum(a-1);
    }
    public static void main(String [] args){
        System.out.println(fac(6));
        System.out.println(sum(8));
    }
}
