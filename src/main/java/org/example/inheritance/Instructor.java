package org.example.inheritance;

public class Instructor extends User {
    public String companyName;

    public Instructor(String username, int id, String companyName) {
        super(username, id);
        this.companyName = companyName;
    }
}
