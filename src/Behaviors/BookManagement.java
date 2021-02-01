package Behaviors;

import Entities.Book;

import java.util.ArrayList;

public class BookManagement {
    ArrayList<Book> books = new ArrayList<>();

    public void show() {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public void update(Book b) {
        for (Book bUpdate : books) {
            if (bUpdate.getId() == b.getId()) {
                bUpdate.setName(b.getName());
                bUpdate.setCode(b.getCode());
            }
        }
    }

    public void add(Book b) {
        books.add(b);
    }

    public Book getBookByCode(int code) {
        Book b = new Book();
        for (Book bok : books) {
            if (bok.getCode() == code) {
                b = bok;
            }
        }
        return b;
    }

    public void remove(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                books.remove(b);
            }
        }
    }
}
