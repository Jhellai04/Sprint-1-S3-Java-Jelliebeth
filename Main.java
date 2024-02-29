import java.util.ArrayList;

public class Main {
    public static void main(String[]args) {

        // System Intro
        System.out.println("|*******************************************|");
        System.out.println("| Welcome to the Library Management System! |");
        System.out.println("|*******************************************|" + "\n");

        // Create 15 books and 5 authors and 20 patrons (for the 1 library)

        // Create 3 array lists to store the books, authors and patrons

        ArrayList<Book> books = new ArrayList<Book>();

        ArrayList<Author> authors = new ArrayList<Author>();

        ArrayList<Patron> patrons = new ArrayList<Patron>();

        // Create 1 library which contains all of the entities mentioned above

        Library library = new Library(books, authors, patrons);

        // Create 5 authors

        Author author1 = new Author("Stephen King", "23 Topsail Rd St. John's NL", "987-6543-2109", "21 September 1947");
        Author author2 = new Author("Agatha Christie", "Greenway Estate, Devon", "456-7890-1234", "15 September 1890");
        Author author3 = new Author("Terry Pratchett", "Beaconsfield, Buckinghamshire", "321-0987-6543", "28 April 1948");
        Author author4 = new Author("Jane Austen", "Steventon, Hampshire", "789-0123-4567", "16 December 1775");
        Author author5 = new Author("Mark Twain", "Hannibal, Missouri", "654-3210-9876", "30 November 1835");
        
        // Create 10 books

        Book book1 = new Book("Harry Potter and the Philosopher's Stone", author1, "9780747532743", "Bloomsbury", 10, Status.AVAILABLE);
        Book book2 = new Book("Murder on the Orient Express", author2, "9780062693662", "William Collins", 8, Status.AVAILABLE);
        Book book3 = new Book("Good Omens", author3, "9780060853983", "HarperTorch", 6, Status.AVAILABLE);
        Book book4 = new Book("Pride and Prejudice", author4, "9780486284736", "Dover Publications", 7, Status.AVAILABLE);
        Book book5 = new Book("The Adventures of Tom Sawyer", author5, "9780140390264", "Puffin Classics", 9, Status.AVAILABLE);
        Book book6 = new Book("It", author1, "9781501175466", "Pocket Books", 5, Status.AVAILABLE);
        Book book7 = new Book("And Then There Were None", author2, "9780062073488", "William Morrow Paperbacks", 4, Status.AVAILABLE);
        Book book8 = new Book("Going Postal", author3, "9780060502935", "HarperTorch", 10, Status.AVAILABLE);
        Book book9 = new Book("Sense and Sensibility", author4, "9780141439662", "Penguin Classics", 6, Status.AVAILABLE);
        Book book10 = new Book("The Adventures of Huckleberry Finn", author5, "9780141321097", "Puffin Classics", 8, Status.AVAILABLE);

        // setting status types for book based on borrowed or not borrowed by patrons
        book1.setStatus(Status.CHECKED_OUT);
        book2.setStatus(Status.OVERDUE);
        book3.setStatus(Status.AVAILABLE);

        
        // Create 5 patrons

        Patron patron1 = new Patron("Jelliebeth Sevilla", "175 Canada Drive St. John's NL", "123-456-7890", "1 January 1980");
        Patron patron2 = new Patron("Zoie Sevilla", "24 Elm Avenue, Manchester", "456-789-0123", "15 May 1992");
        Patron patron3 = new Patron("Zeia Sevilla", "8 Oak Lane, Birmingham", "789-012-3456", "30 November 1975");
        Patron patron4 = new Patron("Zione Sevilla", "36 Maple Road, Liverpool", "321-654-9870", "10 April 1988");
        Patron patron5 = new Patron("Zaira Sevilla", "42 Pine Street, Leeds", "654-987-3210", "5 September 1995");

        // Add the books, authors and patrons to their respective array lists

        // Add the books to the books array list

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);

        // Add the authors to the authors array list

        authors.add(author1);
        authors.add(author2);
        authors.add(author3);
        authors.add(author4);
        authors.add(author5);

        // Add the patrons to the patrons array list

        patrons.add(patron1);
        patrons.add(patron2);
        patrons.add(patron3);
        patrons.add(patron4);
        patrons.add(patron5);
        
        // Add all appropriate books to the correct Author's list of books written

        // Author 1

        author1.addBook(book1);
        author1.addBook(book6);

        // Author 2

        author2.addBook(book2);
        author2.addBook(book7);

        // Author 3

        author3.addBook(book3);
        author3.addBook(book8);

        // Author 4

        author4.addBook(book4);
        author4.addBook(book9);

        // Author 5

        author5.addBook(book5);
        author5.addBook(book10);

        // Test the methods of classes

        // Testing methods related to the Library class

        // Get the list of books in the library
        //System.out.println(library.getBooks());

        // Get the list of authors in the library
        System.out.println(library.getAuthors());
        System.out.println("\n");

        // Get the list of patrons in the library
        System.out.println(library.getPatrons());
        System.out.println("\n");

        // Search for a book by title
        System.out.println(library.searchByTitle("Harry Potter and the Philosopher's Stone"));
        System.out.println("\n");

        // // Search for a book by author
        System.out.println(library.searchByAuthor("Agatha Christie"));
        System.out.println("\n");

        // // Search for a book by ISBN
        //System.out.println(library.searchByISBN("9780747532743"));

        // // Print the string representation of the library
        // System.out.println(library.toString());

        // Testing methods related to the Author class

        // // Getting and setting the name
        System.out.println(author1.getName());
        author1.setName("Stephen King");


        // // Getting and setting the address
        System.out.println(author1.getAddress());
        author1.setAddress("23 Topsail Rd St. John's NL");
        System.out.println("\n");

        // Getting the list of books written by the author
        System.out.println(author1.getListOfBooksWritten());
       

        // Printing the string representation of the author
        System.out.println(author1.toString());
        System.out.println("\n");


        // Testing methods related to the Patron class

        // Getting and setting the name
        System.out.println(patron1.getName());
        patron1.setName("Jelliebeth Sevilla");

        // Getting and setting the address
        System.out.println(patron1.getAddress());
        patron1.setAddress("175 Canada Drive St. John's NL");


        // Testing methods of the Book class

        // Getting and setting the title
        //System.out.println(book1.getTitle());
        // book1.setTitle("New Title");


        // Getting and setting the author
        System.out.println(book1.getAuthor());
        System.out.println("\n");
        // book1.setAuthor(new Author("New Author", "New Address", "555-987-6543", "1990-01-01"));

        // Getting and setting the ISBN
        System.out.println(book1.getISBN());
        book1.setISBN("9780747532743");

        // Getting and setting the publisher
        System.out.println(book1.getPublisher());
        // book1.setPublisher("New Publisher");

        // Getting and setting the number of copies
        System.out.println(book1.getNumberOfCopies());
        // book1.setNumberOfCopies(10);

        // Getting and setting the status
        System.out.println(book1.getStatus());
        System.out.println("\n");
        // book1.setStatus(Status.AVAILABLE);

        // Borrow a book
        book1.borrowBook(patron1);
        System.out.println("\n");

        // Print the list of books borrowed by the patron
        System.out.println(patron1.getListOfBooksBorrowed());
        System.out.println("\n");
        // Return a book
        book1.returnBook(patron1);
        System.out.println("\n");
        
    }
}
