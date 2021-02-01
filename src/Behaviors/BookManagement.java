package Behaviors;

import Entities.Book;
import FileIO.FileProcess;

import java.util.ArrayList;

public class BookManagement {
    ArrayList<Book> books = new ArrayList<>();
    final String PATH = "book.dat";

    public void show() {
        ArrayList<Book> dataFromFile = ( ArrayList<Book>)FileProcess.readFromFile(PATH);
        for (Book book : dataFromFile) {
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
        FileProcess.writeObjectToFile(books, PATH);
    }

    public void add(Book b) {
        books =(ArrayList<Book>) FileProcess.readFromFile(PATH);
        books.add(b);
        FileProcess.writeObjectToFile(books, PATH);
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
        FileProcess.writeObjectToFile(books, PATH);
    }
}
