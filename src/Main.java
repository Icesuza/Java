import model.Product;
import model.ProductCategory;

import java.time.LocalDate;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        Product coca = new Product(1, UUID.randomUUID().toString(), "Coca", "Coca from America", LocalDate.now(), LocalDate.of(2030,1,1), new String[]{"https://www.coca-cola.com/content/dam/onexp/us/en/brands/coca-cola-original/en_coca-cola-original-taste-20-oz_750x750_v1.jpg"},new ProductCategory[]{ProductCategory.DRINK});
        System.out.println(coca);

        Product pepsi = new Product(2, UUID.randomUUID().toString(), "Pepsi","This is pepsi",LocalDate.now(),LocalDate.of(2027,06,03),new String[]{"https://www.pepsi.co.uk/prod/s3fs-public/2024-02/REG.png"},new ProductCategory[]{ProductCategory.DRINK});
        System.out.println(pepsi);
    }
}