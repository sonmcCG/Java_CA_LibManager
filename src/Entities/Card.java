package Entities;

import java.io.Serializable;
import java.util.List;

public class Card implements Serializable {
    private List<Book> books;
    private Student student;
    private int id;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String info = "Card{" +
                ", Student Id=" + student.getId() +
                ", Student Name=" + student.getName() +
                ", Card id=" + id +
                "Books:";
        for (Book b: books) {
            info += b.toString();
        }
        info += '}';
        return info;
    }
}
