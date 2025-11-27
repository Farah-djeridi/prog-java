package main;

import entities.Product;
import entities.ProductManagement;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ProductManagement pm = new ProductManagement();

        List<Product> products = new ArrayList<>();
        products.add(new Product(3, "Laptop", 2500));
        products.add(new Product(1, "Mouse", 35));
        products.add(new Product(2, "Keyboard", 150));

        System.out.println("----- Display All Products -----");
        pm.displayProducts(products, System.out::println);

        System.out.println("----- Filter Price > 100 -----");
        pm.displayProductsByFilter(products,
                p -> p.getPrice() > 100,
                System.out::println);

        System.out.println("----- Product Names -----");
        System.out.println(pm.returnProductsNames(products, Product::getName));

        System.out.println("----- Sorted By ID -----");
        List<Product> sorted = pm.sortProductsById(products, Comparator.comparingInt(Product::getId));
        for (Product p : sorted) {
            System.out.println(p);
        }
    }
}
