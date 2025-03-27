package com.bridgelabz.onlineMarketplace;


public class MarketplaceUtils {
    public static <T> void applyDiscount(Product<T> product, double percentage) {
        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
        System.out.println("Discount applied! New price of " + product.getName() + ": " + product.getPrice());
    }
}

