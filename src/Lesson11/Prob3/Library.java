package Lesson11.Prob3;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<String, Book> bookCollection;

    public Library() {
        this.bookCollection = new HashMap<>();
    }

    public void addBook(String ISBN, String title, String author){

        if(bookCollection.containsKey(ISBN)){
            System.out.println("ISBN" + ISBN + " Exits");
        }else {
            Book newBook = new Book(ISBN, title, author);
            bookCollection.put(ISBN, newBook);
        }
    }

    public void borrowBook(String ISBN){
        Book book = bookCollection.get(ISBN);

        if (book != null) {
            if (book.isBorrowed()) {
                System.out.println("The book with ISBN " + ISBN + " has been borrowed.");
            } else {
                book.setBorrowed(true);
                System.out.println("Book borrowed successfully: " + book);
            }
        } else {
            System.out.println("No book with ISBN found" + ISBN);
        }

    }

    public void returnBook(String ISBN){
        Book book = bookCollection.get(ISBN);

        if (book != null){
            if (book.isBorrowed()){
                book.setBorrowed(false);
                System.out.println("The book with ISBN " + ISBN + " is returned.");
            }else {
                System.out.println("Book with " + ISBN + " is not borrowed");
            }
        }else{
            System.out.println("Book with " + ISBN + " not found");
        }
    }

    public void isBookBorrowed(String ISBN){
        Book book = bookCollection.get(ISBN);
        if (book != null) {
            if (book.isBorrowed()){
                System.out.println("Book with ISBN " + ISBN + " has been borrowed");
            }else{
                System.out.println("Book with ISBN " + ISBN + " is available");
            }
        }else {
            System.out.println("Book with ISBN " + ISBN + " not found");
        }
    }

    public void getBookDetails(String ISBN){
        Book book = bookCollection.get(ISBN);
        if (book != null) {
            System.out.println("Book Details: " + book);
        }else {
            System.out.println("Book with ISBN " + ISBN + " not found");
        }
    }

    public void listAllBooks(){
        if (bookCollection.isEmpty()) {
            System.out.println("No books found.");
        } else {
            System.out.println("List of all books in the library:");
            for (Book book : bookCollection.values()) {
                System.out.println(book);
            }
        }
    }

    public void listBorrowedBooks(){
        boolean foundBorrowed = false;
        for (Book book : bookCollection.values()) {
            if (book.isBorrowed()) {
                System.out.println(book);
                foundBorrowed = true;
            }
        }
        if (!foundBorrowed) {
            System.out.println("No books borrowed yet.");
        }
    }
}
