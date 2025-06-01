package model.entities;

import lombok.Data;

@Data
class TestUser{
    private Integer id;
    private String name;
    private String email;
    private String uuid;
    private String password;
}
public class User {
    public static void main(String[] args){
        TestUser user = new TestUser();
        user.setId(1);
        user.setName("Mimi");
        user.setEmail("mimi@gmail.com");

        System.out.println(user.getName());
        System.out.println(user.getId());
        System.out.println(user.getEmail());
    }
}
