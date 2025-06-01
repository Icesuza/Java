import java.util.Scanner;

class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
public class ExceptionHandling {
    static int inputAge() throws MyException{
        try{
            System.out.print("[+] Input age:");
            return new Scanner(System.in).nextInt();
        }catch (Exception e){
            throw new MyException("Invalid input");
        }
    }
    public static void main(String[] args){
        try{
            System.out.println(inputAge());
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}
