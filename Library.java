import java.util.ArrayList;

public class Library {
    // Attributes
    protected ArrayList<Book> books; // List to store books in the library
    protected ArrayList<Author> authors; // List to store authors in the library
    protected ArrayList<Patron> patrons; // List to store patrons in the library

    // Constructor

    // Parameterized Constructor (This constructor takes in the lists of books, authors and patrons as parameters)

    public Library(ArrayList<Book> books, ArrayList<Author> authors, ArrayList<Patron> patrons) {
        this.books = books;
        this.authors = authors;
        this.patrons = patrons;
    }

    // Methods

    // Getters

    // Get the list of books in the library

    public ArrayList<Book> getBooks() {
        return books;
    }

    // Get the list of authors in the library

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    // Get the list of patrons in the library

    public ArrayList<Patron> getPatrons() {
        return patrons;
    }

    // Setters

    // Set the list of books in the library

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    // Search for a book by title
    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        System.out.println("\n" + title + " is not available in the library.");
        return null; // If the book is not found
    }

    // Search for a book by author
    public ArrayList<Book> searchByAuthor(String authorName) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().getName().equalsIgnoreCase(authorName)) {
                result.add(book);
            }
        }
        return result; // List of books by the specified author
    }

    // Search for a book by ISBN
    public Book searchByISBN(String isbn) {
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                return book;
            }
        }
        return null; // If the book with the specified ISBN is not found
    }

    // toString method

    public String toString() {
        return "\n\nBooks: " + books + "\n\n\nAuthors: " + authors + "\n\n\nPatrons: " + patrons;
    }

}
