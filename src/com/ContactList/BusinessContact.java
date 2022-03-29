package com.ContactList;

public class BusinessContact extends Contact {

    String jobTitle;
    String organization;

    public BusinessContact(String name, String firstName, String lastName, String address, String phoneNumber, String email, String jobTitle, String organization) {
        super(firstName, lastName, address, phoneNumber, email);
        this.jobTitle = jobTitle;
        this.organization = organization;

    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getOrganization() {
        return organization;
    }
}



