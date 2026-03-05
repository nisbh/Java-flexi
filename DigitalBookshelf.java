import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    String ISBN;
    String title;
    String author;
    boolean isAvailable;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // FIX
    }

    public void display() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
        System.out.println();
    }
}

class Library {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(String ISBN) {
        for (Book book : books) {
            if (book.ISBN.equals(ISBN)) {
                if (book.isAvailable) {
                    book.isAvailable = false;
                    System.out.println("Book issued successfully");
                } else {
                    System.out.println("Sorry, this book is currently checked out.");
                }
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable) {
                book.display();
            }
        }
    }

    public void displayAllBooks() {
        for (Book book : books) {
            book.display();
        }
    }
}

public class DigitalBookshelf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // FIX
        Library library = new Library();

        library.addBook(new Book("978-01", "Java Basics", "James"));
        library.addBook(new Book("978-02", "Python Essentials", "Guido"));
        library.addBook(new Book("978-03", "Data Structures", "Mark"));

        int choice;

        do {
            System.out.println("\n1. View all books");
            System.out.println("2. Borrow book");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    library.displayAllBooks(); // FIX
                    break;

                case 2:
                    System.out.print("Enter ISBN to borrow: ");
                    String borrowISBN = sc.nextLine();
                    library.borrowBook(borrowISBN);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        sc.close();
    }
}