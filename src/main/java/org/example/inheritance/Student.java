package org.example.inheritance;

public class Student extends User {
    public String batch;

//    public Student(String username, int id, String batch) {
//        super(username, id);
//        this.batch = batch;
//    }
    //overriding
    public void login(){
        System.out.println(this.username+" logged in Student");
    }
    //overloading
    public void login(String a){
        System.out.println(this.username+" logged in Student with "+a);
    }
}
