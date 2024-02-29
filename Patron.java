import java.util.ArrayList;

public class Patron extends Person {
    // Attributes

    protected ArrayList<Book> listOfBooksBorrowed; // Using ArrayList to store the list of books

    // Constructors

    // Parameterized Constructor

    public Patron(String name, String address, String phoneNumber, String dateOfBirth) {
        super(name, address, phoneNumber, dateOfBirth);
        listOfBooksBorrowed = new ArrayList<Book>();
    }

    // (Overloaded Constructor)

    public Patron(String name, String address, String phoneNumber, String dateOfBirth, ArrayList<Book> listOfBooksBorrowed) {
        super(name, address, phoneNumber, dateOfBirth);
        this.listOfBooksBorrowed = listOfBooksBorrowed;
    }

    // Methods

    // Getters

    // Get all attributes of the Patron one by one using the super keyword

    public String getName() {
        return super.getName();
    }

    public String getAddress() {
        return super.getAddress();
    }

    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    public String getDateOfBirth() {
        return super.getdateOfBirth();
    }

    // Get the list of books borrowed by the patron

    public ArrayList<Book> getListOfBooksBorrowed() {
        return listOfBooksBorrowed;
    }

    // Setters

    // Set the list of books borrowed by the patron

    public void setListOfBooksBorrowed(ArrayList<Book> listOfBooksBorrowed) {
        this.listOfBooksBorrowed = listOfBooksBorrowed;
    }

    // set all attributes of the Patron one by one using the super keyword

    public void setName(String name) {
        super.setName(name);
    }

    public void setAddress(String address) {
        super.setAddress(address);
    }

    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    public void setDateOfBirth(String dateOfBirth) {
        super.setDateOfBirth(dateOfBirth);
    }

    // Other methods

    // Add a book to the list of books borrowed by the patron

    public void addBook(Book book) {
        listOfBooksBorrowed.add(book);
    }

    // Remove a book from the list of books borrowed by the patron

    public void removeBook(Book book) {
        listOfBooksBorrowed.remove(book);
    }

    // Check if the patron has borrowed a book

    public boolean hasBorrowedBook(Book book) {
        for (Book borrowedBook : listOfBooksBorrowed) {
            if (borrowedBook.equals(book)) {
                return true; // Book found in the list of borrowed books
            }
        }
        return false; // Book not found in the list of borrowed books
    }
    

    // toString method using the super keyword

    public String toString() {
        return "\n\n" + super.toString() + "\nList of books borrowed: " + listOfBooksBorrowed;
    }
}
