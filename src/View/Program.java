package View;

import Behaviors.BookManagement;
import Behaviors.CardManagement;
import Behaviors.StudentManagement;
import Entities.Book;
import Entities.Card;
import Entities.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    static CardManagement cm = new CardManagement();
    static BookManagement bm = new BookManagement();
    static StudentManagement sm = new StudentManagement();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        startMenu:
        do {
            System.out.println("1: Student Management");
            System.out.println("2: Book Management");
            System.out.println("3: Card Management");
            int choice = Integer.parseInt(input.nextLine());
            if(choice == 1){
                do {
                    System.out.println("---Student Management---");
                    System.out.println("1: Add");
                    System.out.println("2: Update");
                    System.out.println("3: Delete");
                    System.out.println("4: Show");
                    System.out.println("0: Back");
                    int choice2 = Integer.parseInt(input.nextLine());
                    switch (choice2){
                        case 1:
                            Student s = Menus.getInfoStudent();
                            sm.add(s);
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            sm.show();
                            break;
                        case 0:
                            continue startMenu;
                    }
                }while (true);
            }else if(choice == 2){
                do {
                    System.out.println("1: Add");
                    System.out.println("2: Update");
                    System.out.println("3: Delete");
                    System.out.println("4: Show");
                    System.out.println("0: Back");
                    int choice2 = Integer.parseInt(input.nextLine());
                    switch (choice2){
                        case 0:
                            continue startMenu;
                        case 1:
                            Book b = Menus.getInfoBook();
                            bm.add(b);
                            break;
                        case 2:
                            Book b2 = Menus.getInfoBook();
                            bm.update(b2);
                            break;
                        case 3:
                            System.out.println("Enter your book id you want to remove");
                            int idRemove = Integer.parseInt(input.nextLine());
                            bm.remove(idRemove);
                            break;
                        case 4:
                            bm.show();
                            break;
                    }
                }while (true);
            }else {
                System.out.println("1: Show list card");
                System.out.println("2: Add Card");
                int choiceOption = Integer.parseInt(input.nextLine());
                if(choiceOption == 1){
                    cm.show();
                }else{
                    ArrayList<Book> books = new ArrayList<>();
                    Card card = new Card();
                    System.out.println("Enter Student Code");
                    int sCode = Integer.parseInt(input.nextLine());
                    Student s = sm.getStudentByCode(sCode);
                    System.out.println("Enter Card Id");
                    card.setId(Integer.parseInt(input.nextLine()));
                    card.setStudent(s);
                    System.out.println("Enter quantity book you want to borrow:");
                    int quantity = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < quantity; i++) {
                        System.out.println("Enter book code");
                        int code = Integer.parseInt(input.nextLine());
                        Book b = bm.getBookByCode(code);
                        books.add(b);
                    }
                    card.setBooks(books);
                    cm.add(card);
                }
            }
        }while (true);
    }
}
