package org.example.demo;

public class Student {
    public String name;
    public int age;
    public String batch;

    void registerForClass(String className){
        System.out.println(name + " has registered for " + className + "class");
    }
}
