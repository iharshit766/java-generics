package com.bridgelabz.onlineMarketplace;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Create product catalogs
        ProductCatalog<String> bookCatalog = new ProductCatalog<>();
        ProductCatalog<String> clothingCatalog = new ProductCatalog<>();
        ProductCatalog<String> gadgetCatalog = new ProductCatalog<>();

        // Add Books
        Product<String> book1 = new Product<>("The Alchemist", 500, Categories.FICTION);
        Product<String> book2 = new Product<>("Data Structures", 750, Categories.NON_FICTION);
        bookCatalog.addProduct(book1);
        bookCatalog.addProduct(book2);

        // Add Clothing
        Product<String> shirt = new Product<>("Cotton Shirt", 1200, Categories.MENS_WEAR);
        clothingCatalog.addProduct(shirt);

        // Add Gadgets
        Product<String> laptop = new Product<>("Gaming Laptop", 90000, Categories.LAPTOP);
        gadgetCatalog.addProduct(laptop);

        // Display All Products
        System.out.println(" Book Catalog:");
        bookCatalog.displayProducts();
        System.out.println("\n Clothing Catalog:");
        clothingCatalog.displayProducts();
        System.out.println("\n Gadget Catalog:");
        gadgetCatalog.displayProducts();

        // Apply Discounts
        System.out.println("\nApplying discounts...");
        MarketplaceUtils.applyDiscount(book1, 10);  // 10% discount on book
        MarketplaceUtils.applyDiscount(laptop, 5);  // 5% discount on laptop

        // Display Updated Products
        System.out.println("\n Updated Book Catalog:");
        bookCatalog.displayProducts();
        System.out.println("\n Updated Gadget Catalog:");
        gadgetCatalog.displayProducts();
    }
}
