package org.example.lab_session3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Item> Inventory = new ArrayList<>();

        Electronics electronics1 = new Electronics("100", "ALaptop", 25000, 200, 2);
        Clothing clothing1 = new Clothing("101", "CT-Shirt", 500, 100, "30");
        Book book1 = new Book("102", "BJava Programming", 1500, 50, "James");

        Inventory.add(electronics1);
        Inventory.add(clothing1);
        Inventory.add(book1);

        for(Item a: Inventory){
            System.out.println(a.getName() +" ");
        }

        Collections.sort(Inventory);

        for(Item a: Inventory){
            System.out.println(a.getName() +" ");
        }
    }
}
