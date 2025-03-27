package com.bridgelabz.warehouseManagement;

// WarehouseUtils.java
import java.util.List;

public class WarehouseUtils {
    public static void displayAllItems(List<? extends Items> items) {
        for (Items item : items) {
            System.out.println(item);
        }
    }
}
