package model;

import java.time.LocalDate;
import java.util.Arrays;

public class Product {
    private Integer id;
    private String uuid;
    private String name;
    private String description;
    private LocalDate importDate;
    private LocalDate expDate;
    private String[] img;
    private ProductCategory[] pCategories;

    //constructor
    public Product(){}
    public Product(Integer id, String uuid, String name, String description, LocalDate importDate, LocalDate expDate, String[] img, ProductCategory[] pCategories) {
        this.id = id;
        this.uuid = uuid;
        this.name = name;
        this.description = description;
        this.importDate = importDate;
        this.expDate = expDate;
        this.img = img;
        this.pCategories = pCategories;
    }

    @Override
    public String toString() {
        return "Product:" + "\n" +
                "id=" + id + "\n" +
                "uuid=" + uuid + "\n" +
                "name=" + name + "\n" +
                "description=" + description + "\n" +
                "importDate=" + importDate + "\n" +
                "expDate=" + expDate + "\n" +
                "img=" + Arrays.toString(img) + "\n" +
                "pCategories=" + Arrays.toString(pCategories);
    }
}
