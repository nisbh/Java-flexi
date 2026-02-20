import java.util.ArrayList;
import java.util.List;

class Book{
    String title;
    String author;
    String isbn;
    public Book(String title,String author,String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    public String getTitle(){return title;}
    @Override
    public String toString(){
        return "Title: "+title+"Author: "+author+" ISBN: "+isbn;
    }
}
class Library{
    List<Book>books=new ArrayList<>();
    public void addBook(Book book){
        books.add(book);
    }
    public Book searchByTitle(String title){
        for (Book book:books){
            if (book.getTitle().equalsIgnoreCase(title)) return book;
        }
        return null;
    }
    public void displayAllBooks(){
        if (books.isEmpty()) System.out.println("Library is empty.");
        for (Book book : books) System.out.println(book);
    }
}

public class LibraryApp{
    public static void main(String[] args){
        Library myLibrary=new Library();
        myLibrary.addBook(new Book("LOTR", "J.R.R. Tolkien", "12345"));
        myLibrary.addBook(new Book("1984", "George Orwell", "67890"));
        System.out.println("Displaying Library:");
        myLibrary.displayAllBooks();
        System.out.println("\nSearching for '1984':");
        System.out.println(myLibrary.searchByTitle("1984"));
    }
}