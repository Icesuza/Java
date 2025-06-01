package EmployeeMangement;

public class Employee {
    private Integer id;
    private String uuid;
    private String name;
    private String gender;
    private String position;
    private Double salary;
    public Employee(){}

    public Employee(Integer id, String uuid, String name, String gender, String position, Double salary) {
        this.id = id;
        this.uuid = uuid;
        this.name = name;
        this.gender = gender;
        this.position = position;
        this.salary = salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public void setPosition(String position){
        this.position=position;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public Integer getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Employee:[" + id +"]\n" +
                "uuid='" + uuid + '\n' +
                "name='" + name + '\n' +
                "gender='" + gender + '\n' +
                "position='" + position + '\n' +
                "salary=" + salary;
    }
}
