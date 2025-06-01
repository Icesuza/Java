package model;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
class Fruit <T>{
    T weight;
    String type;
    String taste;
}
@Builder
record Student <T>(
      T data,
      String name
){}

public class TestFruit {
    public static void main(String[] args) {
        Fruit logan = Fruit.builder()
                .taste("Sweet")
                .weight("2.4")
                .build();
        System.out.println(logan);

        Student st = Student.builder()
                .data("From Korea")
                .build();
        System.out.println(st);
    }
}
