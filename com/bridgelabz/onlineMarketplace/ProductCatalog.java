package com.bridgelabz.onlineMarketplace;


import java.util.ArrayList;
import java.util.List;

public class ProductCatalog<T> {
    private List<Product<T>> products = new ArrayList<>();

    public void addProduct(Product<T> product) {
        products.add(product);
    }

    public void displayProducts() {
        for (Product<T> product : products) {
            System.out.println(product);
        }
    }
}
