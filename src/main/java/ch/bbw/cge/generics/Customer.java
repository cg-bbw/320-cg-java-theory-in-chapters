package ch.bbw.cge.generics;

public class Customer {
    String customerNr;
    String firstname;
    String lastname;
    char gender;

    public Customer(String customerNr, String firstname, String lastname, char gender) {
        this.customerNr = customerNr;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
    }
}
