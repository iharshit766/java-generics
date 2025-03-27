package com.bridgelabz.warehouseManagement;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends Items> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
