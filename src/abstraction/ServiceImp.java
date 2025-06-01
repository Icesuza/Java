package abstraction;

public class ServiceImp implements Services{
    @Override
    public void getAllUser() {
        System.out.println("Get all User");
    }

    @Override
    public void getDBconnection() {

    }
    public void run(){
        System.out.println("Project is running");
    }
}
