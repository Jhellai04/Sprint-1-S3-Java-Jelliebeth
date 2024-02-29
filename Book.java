interface Borrowable {
    public void borrowBook(Patron patron);
    public void returnBook(Patron patron);
}

public class Book implements Borrowable {
    // Attributes

    protected String title;
    protected Author author;
    protected String ISBN;
    protected String publisher;
    protected int numberOfCopies;
    protected Status status;

    // Constructor

    // Parameterized Constructor

    public Book(String title, Author author, String ISBN, String publisher, int numberOfCopies, Status status) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.numberOfCopies = numberOfCopies;
        this.status = status;
    }

    // Methods

    // Getters

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public Status getStatus() {
        return status;
    }

    // Setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // toString method

    public String toString() {
        return "\n\nTitle: " + title + "\n\nAuthor: " + author + "\nISBN: " + ISBN + "\nPublisher: " + publisher + "\nNumber of Copies: " + numberOfCopies + "\nStatus: " + status + "\n";
    }

    // Other methods

    // Borrow a book

    @Override
    public void borrowBook(Patron patron) {
        if (numberOfCopies > 0) {
            numberOfCopies--;
            patron.addBook(this); // Add the current book to the patron's list of borrowed books
            setStatus(Status.CHECKED_OUT); // setting the status to checked out
            System.out.println("Book has been borrowed.");
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }
    
    // Return a book

    @Override
    public void returnBook(Patron patron) {
        if (patron.hasBorrowedBook(this)) {
            numberOfCopies++;
            patron.removeBook(this); // Remove the current book from the patron's list of borrowed books
            setStatus(Status.AVAILABLE); // setting the status to available
            System.out.println("Book has been returned.");
        } else {
            System.out.println("The patron hasn't borrowed this book.");
        }
    }
    
}
