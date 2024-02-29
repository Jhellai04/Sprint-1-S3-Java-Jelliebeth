import java.util.ArrayList;

public class Author extends Person {
    // Attributes

    protected ArrayList<Book> listOfBooksWritten; // Using ArrayList to store the list of books objects written by the author

    // Constructors

    // Parameterized Constructors

    public Author(String name, String address, String phoneNumber, String dateOfBirth) {
        super(name, address, phoneNumber, dateOfBirth);
        listOfBooksWritten = new ArrayList<Book>();
    }

    // (Overloaded Constructor)

    public Author(String name, String address, String phoneNumber, String dateOfBirth, ArrayList<Book> listOfBooksWritten) {
        super(name, address, phoneNumber, dateOfBirth);
        this.listOfBooksWritten = listOfBooksWritten;
    }

    // Methods

    // Getters

    // Get the list of books written by the author

    public ArrayList<Book> getListOfBooksWritten() {
        return listOfBooksWritten;
    }

    // Get all attributes of the Author one by one using the super keyword

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

    // Setters

    // Set the list of books written by the author
    public void setListOfBooksWritten(ArrayList<Book> listOfBooksWritten) {
        this.listOfBooksWritten = listOfBooksWritten;
    }

    // set all attributes of the Author one by one using the super keyword

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

    // Add a book to the list of books written by the author
    public void addBook(Book book) {
        listOfBooksWritten.add(book);
    }

    // Remove a book from the list of books written by the author
    public void removeBook(Book book) {
        listOfBooksWritten.remove(book);
    }

    // toString method using the super keyword

    public String toString() {
        return "\n\n" + super.toString();
    }

}
