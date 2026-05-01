package org.example.lab_session;

public class Member extends User{
    private int borrowedBooksCount;
    private static final int MAX_BORROW_LIMIT = 5;

    public Member(){
        super();
        this.borrowedBooksCount = 0;
    }

    public Member(String name, String contactInfo){
        super(name, contactInfo);
        this.borrowedBooksCount = 0;
    }

    public Member(Member other){
        super(other);
        this.borrowedBooksCount = other.borrowedBooksCount;
    }

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }

    public void setBorrowedBooksCount(int borrowedBooksCount) {
        this.borrowedBooksCount = borrowedBooksCount;
    }

    @Override
    public void displayDashboard(){
        System.out.println("Member Dashboard");
        System.out.println("Name: " + getName());
        System.out.println("Contact Info: " + getContactInfo());
        System.out.println("Borrowed Books Count: " + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks(){
         return borrowedBooksCount < MAX_BORROW_LIMIT;
    }

}
