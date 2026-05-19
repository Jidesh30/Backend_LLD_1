package org.example.lab_session3.milestone1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory <T extends Item> {
    private HashMap<String, T> items;

    public Inventory() {
        items = new HashMap<>();
    }

    public void addItem(T item) {
        if(item.getQuantity() <=0) {
            System.out.println("Item quantity must be greater than 0");
        }
        if(items.containsKey(item.getId())){
            System.out.println("Item with id: " + item.getId() + " already exists.");
        }
        items.put(item.getId(), item);
    }

    public void removeItem(String id) {
        if(!items.containsKey(id)){
            System.out.println("Item with id: " + id + " doesn't exist");
            return ;
        }
        items.remove(id);
    }

    public <T> T getItem(String id) {
        return (T) items.get(id);
    }

    public List<T> getAllItems(){
        return new ArrayList<>(items.values());
    }
}
