package org.example.lab_session;

public interface Lendable {
    boolean lend(User user);

    void returnBook(User user);

    boolean isAvailable();
}
