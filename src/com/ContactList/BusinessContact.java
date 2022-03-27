package com.ContactList;

public class BusinessContact extends Contact {

    String jobTitle;
    String organization;

    public BusinessContact(String firstName, String lastName, String address, String phoneNumber, String email) {
        super(firstName, lastName, address, phoneNumber, email);
    }



}
