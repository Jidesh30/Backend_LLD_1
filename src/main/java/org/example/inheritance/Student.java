package org.example.inheritance;

public class Student extends User {
    public String batch;

    public Student(String username, int id, String batch) {
        super(username, id);
        this.batch = batch;
    }
}
