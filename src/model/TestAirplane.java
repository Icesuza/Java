package model;

import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;
@Data
class Airplane{
    private Integer id;
    private String uuid;
    private String name;
    private Integer wheel;
    private Integer wing;
    private LocalDate createDate;
    private String brand;
    private Integer numberOfPeople;
}

public class TestAirplane {
    public static void main(String[] args){
        Airplane air = new Airplane();
        air.setId(1);
        air.setUuid(UUID.randomUUID().toString());
        air.setName("A203");
        air.setWheel(6);
        air.setWing(3);
        air.setCreateDate(LocalDate.of(2005,6,3));
        air.setBrand("Chanelle");
        air.setNumberOfPeople(300);
        System.out.println(air);

        Airplane air1 = new Airplane();
        air1.setId(2);
        air1.setUuid(UUID.randomUUID().toString());
        air1.setName("A2500");
        air1.setWheel(4);
        air1.setWing(2);
        air1.setCreateDate(LocalDate.of(2000,11,3));
        air1.setBrand("LouisVitton");
        air1.setNumberOfPeople(200);
        System.out.println(air1);
    }
}
