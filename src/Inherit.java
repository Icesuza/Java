class Person{
    int id;
    String name;
}
class Teacher extends Person{}
class Student extends Person{}
public class Inherit {
    public static void main (String[] args){
        Teacher tc = new Teacher();
        tc.name = "sophea";
        System.out.println(tc.name);

        Student st = new Student();
        st.id = 2;
        System.out.println(st.id);
    }
}
