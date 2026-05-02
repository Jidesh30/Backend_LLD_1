package org.example.lab_session;

public class Textbook extends Book {
    private String subject;
    private int edition;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public Textbook(String isbn, String title, String author, String subject, int edition){
        super(isbn, title, author);
        this.subject = subject;
        this.edition = edition;
    }

    @Override
    void displayBookDetails() {
        System.out.println("TextBook Details:"
                + getTitle() + ", "
                + getAuthor() + ", "
                + getIsbn() + ", "
                + subject + ", Edition: " + edition);
    }


}
