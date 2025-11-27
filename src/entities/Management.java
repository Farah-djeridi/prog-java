package entities;


import java.util.*;
import java.util.function.*;

public interface Management {

    void displayProducts(List<Product> products, Consumer<Product> con);

    void displayProductsByFilter(List<Product> products,
                                 Predicate<Product> pre,
                                 Consumer<Product> con);

    String returnProductsNames(List<Product> products,
                               Function<Product, String> fun);

    Product createProduct(Supplier<Product> sup);

    List<Product> sortProductsById(List<Product> products,
                                   Comparator<Product> com);


}
