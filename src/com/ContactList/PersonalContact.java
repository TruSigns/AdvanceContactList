package com.ContactList;

public class PersonalContact extends Contact {

    String birthday;


    public PersonalContact(String firstName, String lastName, String address, String phoneNumber, String email, String birthday) {
        super(firstName, lastName, address, phoneNumber, email);
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }
}
