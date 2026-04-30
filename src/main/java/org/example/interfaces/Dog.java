package org.example.interfaces;

public class Dog extends Animal implements Runner, Swimmer {
    public String breed;

    public void makeSound(){
        System.out.println("Bark");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating");
    }

    @Override
    public void run() {
        System.out.println("The dog is running");
    }

    @Override
    public void swim() {
        System.out.println("The dog is swimming");
    }
}
