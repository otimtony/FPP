package Lesson11.Prob3;

public class Test {

    public static void main(String[] args) {
        Library library = new Library();

        // Add books to the library
        library.addBook("1N11", "To kill a mocking bird", "Testing Name");
        library.addBook("2N22", "Moby Dick", "Names Testing");
        library.addBook("3N33", "First Blood", "Jean Claude Van Damme");

        library.borrowBook("3N33");
        library.returnBook("3N33");
        library.isBookBorrowed("2N22");
        library.getBookDetails("1N11");
        library.listAllBooks();
        library.listBorrowedBooks();
    }
}
