import java.util.UUID;

class First{
    protected static void sum(int a, int b){
        System.out.println("Sum: "+(a+b));
    }
    protected static void substract(int a, int b){
        if(a>b){
            System.out.println("Substract: "+(a-b));
        }else{
            System.out.println("Substract: "+(b-a));
        }
    }
}
class User{
    public int id;
    public String name;
    public String uuid;
    public String email;
    public void setUserInfo(int id, String name, String uuid, String email){
        this.id = id;
        this.name = name;
        this.uuid= uuid;
        this.email = email;
    }
    public void getUserInfo(){
        System.out.println("ID: "+id);
        System.out.println("UUID: "+uuid);
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
    }
}
public class ClassLesson {
    public static void main(String[] args){
        User u = new User();
        u.setUserInfo(1,"Momo", UUID.randomUUID().toString(),"momo@gmail.com");
        u.getUserInfo();

        User u2 = new User();
        u2.setUserInfo(2,"Nymi",UUID.randomUUID().toString(),"nymi@gmail.com");
        u2.getUserInfo();
    }
}
