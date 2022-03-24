package com.ContactList;

public class PersonalContact extends ContactList{

    int dateOfBirth;


    public void PersonalContact(String firstName, String lastName, String address, int phoneNumber, String email, int dateOfBirth) {
        super.contactList(firstName, lastName, address, phoneNumber, email);

        this.dateOfBirth = dateOfBirth;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }
}
