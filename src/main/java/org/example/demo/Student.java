package org.example.demo;

public class Student {
    public String name;
    public int age;
    public String batch;

    public Student(){
        this.name = "Unknown";
        this.age = 0;
        this.batch = "Not Assigned";
    }

    public Student(String name, int age, String batch){
        this.name = name;
        this.age = age;
        this.batch = batch;
    }

    void registerForClass(String className){

        System.out.println(name + " has registered for " + className + "class");
    }
}
