package org.example.lab_session;

public class Test {
    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem();

        Member member = new Member("Ayush", "12536");
        Librarian librarian = new Librarian("Naveen", "001", "1");

        lms.registerUser(member);
        lms.registerUser(librarian);

        Textbook textbook = new Textbook("ISBN1", "Java programming", "Danish dns", "Education", 1);
        NovelBook novelBook = new NovelBook("ISBN2", "The Great Gatsby", "F. Scott Fitzgerald", "Classic");

        lms.addBook(textbook);
        lms.addBook(novelBook);

        textbook.lend(member);

        System.out.println("Library Management System initialized successfully:");

        textbook.returnBook(member);

        System.out.println("Book returned successfully:");
    }
}
