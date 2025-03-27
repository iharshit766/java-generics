package com.bridgelabz.warehouseManagement;

public class Items {
    private String name;
    private double price;
    private Category category;

    public enum Category {
        ELECTRONICS, GROCERIES, FURNITURE
    }

    public Items(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return category + " - Name: " + name + ", Price: " + price;
    }
}
