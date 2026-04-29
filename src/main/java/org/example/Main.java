package org.example;

import org.example.demo.BankAccount;
import org.example.demo.Exam;
import org.example.demo.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Jidesh";
        student.age = 26;
        student.batch = "April 26";
        Exam exam = new Exam();
        exam.examId = 101;
        exam.examName = "Backend OOPS";
        student.exam = exam;

        Student student1 = new Student(student);
//
//        Student student2 = new  Student();
//        student2.name = "Joe dane";
//        student2.age = 23;
//        student2.batch = "April 25";
//
//        System.out.println("Student details:");
//        BankAccount account1 = new BankAccount();
//        account1.ownerName = "Jidesh";
//        account1.balance = 1000;
//        account1.deposit(500);
//        account1.showBal();
//
//        account1.withdraw(150);
//        account1.showBal();
//        account1.printTransaction();
//        System.out.println("Bankaccount details:");
//
//        Student student3 = new Student("John", 26, "May 2026");
//        Student student4 = new Student(student3);


        System.out.println("Student default details:");

    }
}