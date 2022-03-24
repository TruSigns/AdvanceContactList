package com.ContactList;

public class BusinessContact extends ContactList{

    String jobTitle;
    String organization;


    public void businessContact(String firstName, String lastName, String address, int phoneNumber, String email) {
        super.contactList(firstName, lastName, address, phoneNumber, email);
        this.jobTitle = jobTitle;
        this.organization = organization;
    }
}
