import model.Employee;
import model.EmployeePosition;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.UUID;

public class Emp {
    static final int maxEmployees = 50;
    static Employee[] employees = new Employee[maxEmployees];
    static int n = 0;
    static boolean isNull= true;
    public static void printOption(){
        printStyle();
        System.out.println("[+] Employee Management [+]");
        System.out.println("""
                1. Add Employee
                2. Display All Employee
                3. Search Employee
                4. Update Employee
                5. Delete Employee
                6. Exit
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
                    case 3 -> searchEmployee();
                    case 4 -> updateEmployee();
                    case 5 -> deleteEmployee();
                    case 6 -> {
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
    public static void insertEmployee(){
        printStyle();
        try {
            if (n >= maxEmployees) {
                System.out.println("Cannot add more employees.");
                return;
            }

            System.out.print("Enter Name: ");
            String name = new Scanner(System.in).nextLine();
            System.out.print("Enter Email: ");
            String email = new Scanner(System.in).nextLine();
            System.out.print("Enter Profile: ");
            String profile = new Scanner(System.in).nextLine();
            System.out.print("Enter Salary: ");
            BigDecimal salary = new Scanner(System.in).nextBigDecimal();
            System.out.print("Enter Position (MANAGER/SALE/MARKETING): ");
            EmployeePosition position = EmployeePosition.valueOf(new Scanner(System.in).next().toUpperCase());

            employees[n] = new Employee(
                    n + 1,
                    UUID.randomUUID().toString(),
                    name,
                    email,
                    profile,
                    LocalDate.now(),
                    salary,
                    position
            );
            n++;
            System.out.println("Employee added.");
        }catch (InputMismatchException e){
            System.out.println("!Invalid option");
        }
    }
    public static void displayAllEmployee(){
        if(!isNull){
            printStyle();
            System.out.println("[+] Display Employee [+]");
            for (Employee em : employees) {
                if (em != null) {
                    System.out.println(em);
                    printStyle();
                }
            }
        }else {
            System.out.println("There's no employee");
        }
    }
    public static void searchEmployee(){
        System.out.print("Enter Employee Id to search: ");
        int id = new Scanner(System.in).nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (employees[i].getId()==id) {
                System.out.println(employees[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
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
                if (id == employees[i].getId()) {
                    System.out.println(employees[i]);
                    System.out.println("""
                            1. Name
                            2. Email
                            3. Profile
                            4. Position
                            5. Salary
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
                            employees[i].setName(newName);
                        }
                        case 2 -> {
                            System.out.print("[+] Insert email:");
                            String email = new Scanner(System.in).next();
                            employees[i].setEmail(email);
                        }
                        case 3 ->{
                            System.out.print("[+] Insert profile url:");
                            String profile = new Scanner(System.in).next();
                            employees[i].setProfile(profile);
                        }
                        case 4 -> {
                            System.out.print("[+] Insert new position:");
                            EmployeePosition position = EmployeePosition.valueOf(new Scanner(System.in).next().toUpperCase());
                            employees[i].setPosition(position);
                        }
                        case 5 -> {
                            System.out.print("[+] Insert salary:");
                            BigDecimal salary = new Scanner(System.in).nextBigDecimal();
                            employees[i].setSalary(salary);
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

            for (int i = 0; i < n; i++) {
                if (employees[i].getId() == id) {
                    for (int j = i; j < n - 1; j++) {
                        employees[j] = employees[j + 1];
                    }
                    employees[n - 1] = null;
                    n--;
                    System.out.println("Employee deleted.");
                    return;
                }
            }
            System.out.println("Employee ID not found.");
        }catch (InputMismatchException e){
            System.out.println("!Invalid option");
        }
    }
    public static void printStyle(){
        System.out.println("=".repeat(30));
    }
    public static void checkNull(){
        for (Employee emp:employees) {
            if (emp != null) {
                isNull=false;
                break;
            }
            else {
                isNull=true;
            }
        }
    }
    public static void main(String[] args){
        chooseOption();
    }
}
