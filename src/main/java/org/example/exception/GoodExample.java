package org.example.exception;

import java.util.Scanner;

public class GoodExample {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();
        try {
            checkAge(age);
            System.out.println("Entered age is valid");
        } catch (InvalidAgeException iae){
            System.out.println("The entered age is invalid: "  + iae.getMessage());
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if(age<0 ) {
            throw new InvalidAgeException("Age cannot be -ve");
        }
        if(age>120) {
            throw new InvalidAgeException("Age cannot be greater than 120");
        }
    }
}
