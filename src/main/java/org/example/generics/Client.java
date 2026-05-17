package org.example.generics;


import org.example.generics.wildcard.Tiger;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class Client {
    public static void main(String[] args) {
        Pair pair = new Pair();

        pair.setFirst("Hello World");
        pair.setSecond(10);

        Pair pair2 = new Pair();
        pair.setFirst("JLM");
        pair.setSecond(30);

        GenericPair<String,Integer> genericPair = new GenericPair<>();

        genericPair.setFirst("Hello future");
        genericPair.setSecond(100);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Dog());
        animals.add(new Cat());

        printAnimalNames(animals);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());

        printAnimalNames(dogs);


    }

    static <T extends Animal> void printAnimalNames(List<T> animals){
        for(T a: animals){
            System.out.println(a.getName());
        }
    }

    static void priintNumberofLegs(List<? super Tiger> animals){
         for(Object a: animals){
             System.out.println(((Animal)a).getName());
         }
    }
}
