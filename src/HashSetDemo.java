import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@Getter
@AllArgsConstructor
@ToString
class Product implements Comparable<Product>{
    private Integer id;
    private String name;
    private LocalDate releaseDate;
    private Set<Category>categories;

    @Override
    public int compareTo(Product o) {
        //return Integer.compare(this.id, o.id) *(-1);// descending
        return Integer.compare(this.id, o.id);// ascending;
    }
}
enum Category{
    FOOD,
    FAST_FOOD,
    VEGETABLE,
}

public class HashSetDemo {
    public static void main(String[] args) {
//        Set<Integer> set1 = Set.of(4,13,7,5,9);
//        Set<Integer> integerSet = new HashSet<>(
//                Set.of(6,7,3,8)
//        );
//        integerSet.add(13);
//        System.out.println(integerSet);
//        integerSet.remove(4);
//        integerSet.removeIf(e->e>0);
//        System.out.println(integerSet);

//        Set<Category> categories = new HashSet<>(Set.of(Category.FOOD, Category.FAST_FOOD));
//        Product burger = new Product(1,"burger", LocalDate.of(2024,06,03),categories);
//        Product pizza = new Product(2,"pizza", LocalDate.of(2024,06,03),categories);
//
//        Set<Product> products = new HashSet<>();
//        products.add(burger);
//        products.add(pizza);
//
//        products.stream().filter(p->p.getCategories().equals(Set.of(Category.FOOD,Category.FAST_FOOD))).forEach(System.out::println);

            Set<Category> categories
                    = new HashSet<>(Set.of(Category.FOOD, Category.FAST_FOOD));
            Product burger = new Product(1,"Burger",
                    LocalDate.of(2024,2,2),
                    categories);
            Product pizza = new Product(2, "Pizza Company",
                    LocalDate.of(2023,2,2),
                    categories);
            Set<Product> products = new TreeSet<>();
            products.add(burger);
            products.add(pizza);
            System.out.println(products);
    }
}
