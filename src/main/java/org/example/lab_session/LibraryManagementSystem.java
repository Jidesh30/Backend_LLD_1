package org.example.lab_session;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    private static List<Book> bookInventory;
    private List<User> registeredUsers;

    public LibraryManagementSystem(){
        this.bookInventory = new ArrayList<>();
        this.registeredUsers = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookInventory.add(book);
    }

    public void registerUser(User user){
        registeredUsers.add(user);
    }

    public static List<Book> searchBook(String criteria){
        List<Book> results = new ArrayList<>();

        for(Book b: bookInventory){
            String title = b.getTitle();
            String author = b.getAuthor();

            if(title!=null && title.equals(criteria)){
                results.add(b);
            } else if(author!=null && author.equals(criteria)){
                results.add(b);
            }
        }

        return results;
    }

}
