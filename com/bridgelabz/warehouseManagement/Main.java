package com.bridgelabz.warehouseManagement;

public class Main {
    public static void main(String[] args) {

        Storage<Items> warehouseStorage = new Storage<>();

        // Add items to storage
        warehouseStorage.addItem(new Items("Laptop", 75000, Items.Category.ELECTRONICS));
        warehouseStorage.addItem(new Items("Smartphone", 50000, Items.Category.ELECTRONICS));
        warehouseStorage.addItem(new Items("Apples", 200, Items.Category.GROCERIES));
        warehouseStorage.addItem(new Items("Milk", 50, Items.Category.GROCERIES));
        warehouseStorage.addItem(new Items("Sofa", 15000, Items.Category.FURNITURE));
        warehouseStorage.addItem(new Items("Table", 5000, Items.Category.FURNITURE));


        System.out.println("Warehouse Storage:");
        warehouseStorage.displayItems();

        // Display using wildcard method
        System.out.println("\nDisplaying all items using wildcard method:");
        WarehouseUtils.displayAllItems(warehouseStorage.getItems());
    }
}

