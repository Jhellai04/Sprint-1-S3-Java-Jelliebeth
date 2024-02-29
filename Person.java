public class Person {
    // Attributes

    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String dateOfBirth;

    // Constructor

    // Parameterized Constructor

    public Person(String name, String address, String phoneNumber, String dateOfBirth) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    // Methods

    // Getters

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getdateOfBirth() {
        return dateOfBirth;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address; 
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // toString method

    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPhone Number: " + phoneNumber + "\nDate of Birth: " + dateOfBirth;
    }

}
