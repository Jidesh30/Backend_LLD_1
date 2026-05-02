package org.example.lab_session;

public class NovelBook extends Book{
    private String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public NovelBook(String isbn, String title, String author, String genre){
        super(isbn, title, author);
        this.genre = genre;
    }

    @Override
    void displayBookDetails() {
        System.out.println("Novel Book Details: "
                + getTitle() + ", "
                + getAuthor() + ", "
                + getIsbn() + ", Genre: " + genre);
    }
}
