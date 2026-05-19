package org.example.lab_session3.milestone1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Item> Inventory1 = new ArrayList<>();

        Electronics electronics1 = new Electronics("100", "ALaptop", 25000, 200, 2);
        Clothing clothing1 = new Clothing("101", "CT-Shirt", 5000, 100, "30");
        Book book1 = new Book("102", "BJava Programming", 1500, 50, "James");

        Inventory1.add(electronics1);
        Inventory1.add(clothing1);
        Inventory1.add(book1);

        System.out.println("Before sorting: ");

        for(Item item: Inventory1){
            System.out.println(item.getName() +" - $ " + item.getPrice());
        }

        Collections.sort(Inventory1);

        System.out.println("After sorting by name: ");

        for(Item item: Inventory1){
            System.out.println(item.getName() +" - $ " + item.getPrice());
        }

        Collections.sort(Inventory1, new ItemPriceComparator());

        System.out.println("After sorting by price: ");

        for(Item item: Inventory1) {
            System.out.println(item.getName() + " - $ " + item.getPrice());
        }

//        org.example.lab_session3.milestone1.Inventory<Item> inventory =
//                new org.example.lab_session3.milestone1.Inventory<>();
//
//        inventory.addItem(electronics1.getId(), electronics1.getName());

//        Inventory<Book> bookInventory = new Inventory<>();
//
//        bookInventory.addItem(new Book("100", "The Great Gatsby", 25000, 200, "Vijay"));
//        bookInventory.addItem(new Book("102", "Java Programming", 1500, 50, "James"));
//        bookInventory.addItem(new Book("103", "C++ Programming", 1200, 30, "John"));
//        System.out.println("Books in Inventory");
//
//        for(Book book: bookInventory.getAllItems()){
//            System.out.println(book.getName() + " by " + book.getAuthor());
//        }
//        RecentlyViewedItems items = new RecentlyViewedItems();
//        for(int i=1; i<=7; i++){
//            items.addRecentlyViewedItem(new Book("10"+i, "Book"+i, 1000+i*100, 10+i, "Author"+i));
//        }
//
//        System.out.println("Recently Viewed Items:");
//        for(Item item: items.getRecentlyViewedItems()) {
//            System.out.println(item.getName());
//        }
//
//        OrderProcessor orderProcessor = new OrderProcessor();
//        orderProcessor.addOrder(new Order("Order001", true));
//        orderProcessor.addOrder(new Order("Order002", false));
//        orderProcessor.addOrder(new Order("Order003", true));
//
//        System.out.println("Processing Orders:");
//
//        while(orderProcessor.getSize() > 0) {
//            Order order = orderProcessor.processOrder();
//            System.out.println("Processed order id: " + order.getOrderId());
//        }
    }
}
