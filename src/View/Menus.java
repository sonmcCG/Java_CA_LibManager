package View;

import Entities.Book;
import Entities.Student;

import java.util.Scanner;

public class Menus {
    static Scanner input = new Scanner(System.in);

    public static Student getInfoStudent() {
        Student s = new Student();
        System.out.println("Enter Student Id");
        s.setId(Integer.parseInt(input.nextLine()));
        System.out.println("Enter Student Name");
        s.setName(input.nextLine());
        return s;
    }

    public static Book getInfoBook() {
        Book b = new Book();
        System.out.println("Enter book id:");
        b.setId(Integer.parseInt(input.nextLine()));
        System.out.println("Enter book name:");
        b.setName(input.nextLine());
        System.out.println("Enter book code");
        b.setCode(Integer.parseInt(input.nextLine()));
        return b;
    }
}
