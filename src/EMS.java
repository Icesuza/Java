import EmployeeMangement.Employee;

import java.util.*;

public class EMS {
    static ArrayList <Employee> e =new ArrayList<>();
    static boolean isSet= false;
    static int id;
    static int n;
    public static void printOption(){
        printStyle();
        System.out.println("[+] Employee Management [+]");
        System.out.println("""
                1. Add Employee
                2. Display All Employee
                3. Update Employee
                4. Delete Employee
                5. Exit
                """);
    }
    public static void chooseOption(){
        try {
            boolean work = true;
            while (work) {
                printOption();
                printStyle();
                System.out.print("[+] Choose option:");
                int op = new Scanner(System.in).nextInt();
                switch (op) {
                    case 1 -> insertEmployee();
                    case 2 -> displayAllEmployee();
                    case 3 -> updateEmployee();
                    case 4 -> deleteEmployee();
                    case 5 -> {
                        System.out.println("Exiting...");
                        work = false;
                    }
                    default -> System.out.println("!Invalid option");
                }
            }
        }catch (InputMismatchException e){
            System.out.println("!Invalid option");
        }
    }
    public static void setEmployee(){
        try {
            printStyle();
            System.out.print("[+] Insert number of employee you want to add:");
            n = new Scanner(System.in).nextInt();
            isSet=true;
        }catch (InputMismatchException e){
            System.out.println("!Invalid option");
        }
    }
    public static void insertEmployee(){
        setEmployee();
        printStyle();
        try {
            if(isSet) {
                System.out.println("[+] Insert Employee [+]");
                for (int i = 0; i <n; i++) {
                    System.out.print("[+] Insert Employee name:");
                    String name = new Scanner(System.in).nextLine();
                    if(name.isBlank()) {
                        System.out.println("!Invalid input");
                        return;
                    }
                    System.out.print("[+] Insert Employee gender:");
                    String gender = new Scanner(System.in).next();
                    System.out.print("[+] Insert Employee position:");
                    String position = new Scanner(System.in).nextLine();
                    if(position.isBlank()) {
                        System.out.println("!Invalid input");
                        return;
                    }
                    System.out.print("[+] Insert Employee salary:");
                    double salary = new Scanner(System.in).nextDouble();
                    e.add(new Employee((id+=1), UUID.randomUUID().toString(), name, gender, position, salary));
                    printStyle();
                }
                System.out.println("Employee added successfully");
            }
        }catch (InputMismatchException e){
            System.out.println("!Invalid option");
        }
    }
    public static void displayAllEmployee(){
        checkNull();
        printStyle();
        System.out.println("[+] Display Employee [+]");
        for(Employee em:e){
            System.out.println(em);
            printStyle();
        }
    }
    public static void updateEmployee(){
        checkNull();
        displayAllEmployee();
        printStyle();
        try {
            System.out.print("[+] Insert ID:");
            int id = new Scanner(System.in).nextInt();
            for (int i = 0; i < n; i++) {
                if (id == e.get(i).getId()) {
                    System.out.println(e.get(i));
                    System.out.println("""
                            1. Employee Name
                            2. Gender
                            3. Position
                            4. Salary
                            """);
                    System.out.print("[+] Choose properties you want to update:");
                    int op = new Scanner(System.in).nextInt();
                    switch (op) {
                        case 1 -> {
                            System.out.print("[+] Insert new name:");
                            String newName = new Scanner(System.in).nextLine();
                            if(newName.isBlank()) {
                                System.out.println("!Invalid input");
                                return;
                            }
                            e.get(i).setName(newName);
                        }
                        case 2 -> {
                            System.out.print("[+] Insert gender:");
                            String gen = new Scanner(System.in).next();
                            e.get(i).setGender(gen);
                        }
                        case 3 -> {
                            System.out.print("[+] Insert new position:");
                            String position = new Scanner(System.in).nextLine();
                            if(position.isBlank()) {
                                System.out.println("!Invalid input");
                                return;
                            }
                            e.get(i).setPosition(position);
                        }
                        case 4 -> {
                            System.out.print("[+] Insert salary:");
                            double salary = new Scanner(System.in).nextDouble();
                            e.get(i).setSalary(salary);
                        }
                        default -> System.out.println("!Invalid option");
                    }
                    System.out.println("Employee update successfully");
                } else {
                    System.out.println("Employee with ID " + id + " not found.");
                }
            }
        }catch (InputMismatchException e){
            System.out.println("!Invalid option");
        }
    }
    public static void deleteEmployee() {
        checkNull();
        displayAllEmployee();
        printStyle();
        try {
            System.out.print("[+] Insert ID to delete:");
            int id = new Scanner(System.in).nextInt();
            boolean found = false;

            for (int i = 0; i < n; i++) {
                if (e.get(i).getId() == id) {
                    e.remove(i);
                    System.out.println("Employee deleted successfully.");
                    return;
                } else {
                    System.out.println("Employee with ID " + id + " not found.");
                }
            }
        }catch (InputMismatchException e){
            System.out.println("!Invalid option");
        }
    }
    public static void printStyle(){
        System.out.println("=".repeat(30));
    }
    public static void checkNull(){
        if(e==null){
            System.out.println("There's no employee yet");
        }
    }
    public static void main(String[] args){
        chooseOption();
    }
}
