package org.example.lab_session;

public abstract class User {
    private static int TOTAL_USERS = 0;
    private static int ID_SEQUENCE = 0;
    private String userId;
    private String name;
    private String contactInfo;

    public User(){
        this.userId = generateUniqueId();
        this.name = "null";
        this.contactInfo = "null";
    }

    public User(String name, String contactInfo){
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public User(User other){
        this.userId = other.getUserId();
        this.name = other.getName();
        this.contactInfo = other.getContactInfo();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    protected final String generateUniqueId(){
        TOTAL_USERS++;
        return "U-" + ID_SEQUENCE++;
    }

    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
    public abstract void incrementBorrowedBooks();

    public static int getTotalUsers(){
        return TOTAL_USERS;
    }

    public abstract void decrementBorrowedBooks();

}
