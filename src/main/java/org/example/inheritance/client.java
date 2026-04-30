package org.example.inheritance;

public class client {
    public static void main(String[] args) {
        User user = new User();
        Student student = new Student();
        Instructor instructor = new Instructor();
        SpecialStudent specialStudent = new SpecialStudent();

        User user1 = new Student();
        user1.id = 33;
        user1.username = "Jake";
        user1.login();

        Student s2 = new Student();
        s2.login("Jason");

        System.out.println();

    }
}
