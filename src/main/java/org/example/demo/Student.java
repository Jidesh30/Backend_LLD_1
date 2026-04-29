package org.example.demo;

public class Student {
    public String name;
    public int age;
    public String batch;
    public Exam exam;

    public Student(){
        this.name = "Unknown";
        this.age = 0;
        this.batch = "Not Assigned";
    }

    public Student(String name, int age, String batch, Exam exam){
        this.name = name;
        this.age = age;
        this.batch = batch;
        this.exam = exam;
    }

    public Student(Student other){
        this.name = other.name;
        this.age = other.age;
        this.batch = other.batch;
//        this.exam = other.exam; // shallow copy
        this.exam = new Exam(other.exam);
    }

    void registerForClass(String className){

        System.out.println(name + " has registered for " + className + "class");
    }
}
