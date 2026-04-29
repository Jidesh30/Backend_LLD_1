package org.example.inheritance;

public class User {
    public String username;
    public int id;


    public User(String username, int id){
        this.username = username;
        this.id = id;
        System.out.println("User object created");
    }
}
