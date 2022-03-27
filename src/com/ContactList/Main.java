package com.ContactList;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    ArrayList<Contact> contacts = new ArrayList<>();


    public static void main(String[] args) {
        displayMen();
    }


    public static void displayMen() {

        do {

            System.out.println("Please choose from the following selection \n press 1 add a  contact \n press 2 to a view contact \n press 3 to exit your contact list");

            Scanner sc = new Scanner(System.in);
            int select = sc.nextInt();

            switch (select) {
                case 1:
                    //use this to add a business contact
                    // System.out.println("This is a test ot see the code is working");
                    addContact();
                    break;
                case 2:
                    //use this to add a personal contact

                    break;
                case 3:
                    //allow the user to display the contact information
                    break;
                case 4:
                    //this is to quit the program
            }

        } while (true);
    }

    public static void addContact() {


        ArrayList<Contact> contacts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        //ask the user if they want a personal or business contact
        System.out.println("Please 1 if you want to add a personal contact or press 2 for business1");
        int select = sc.nextInt();

        if (select == 1) {
            System.out.println("Please enter the user first name");
            String firstName = sc.next();
            System.out.println("Please enter the user last name");
            String lastName = sc.next();
            System.out.println("Please enter the user address");
            String address = sc.next();
            System.out.println("Please enter the user phoneNumber");
            String phoneNumber = sc.next();
            System.out.println("Please enter the user email");
            String email = sc.next();

            //ask for confirmation

            System.out.println("The following information you enter was : " + firstName + " " + lastName + " " + address + "" +
                    " " + phoneNumber + " " + email + " is this information is correct, then please press Y");

            String confirm = sc.next().toUpperCase(Locale.ROOT);
            if (confirm.equals("Y")) {
                contacts.add(new Contact(firstName, lastName, address, phoneNumber, email));
            } else {
                addContact();
            }


        } else if (select == 2) {

            System.out.println("Please enter the user first name");
            String firstName = sc.next();
            System.out.println("Please enter the user last name");
            String lastName = sc.next();
            System.out.println("Please enter the user address");
            String address = sc.next();
            System.out.println("Please enter the user phoneNumber");
            String phoneNumber = sc.next();
            System.out.println("Please enter the user email");
            String email = sc.next();

            String confirm = sc.next().toUpperCase(Locale.ROOT);
            if (confirm.equals("Y")) {
                contacts.add(new BusinessContact(firstName, lastName, address, phoneNumber, email));
            } else {
                addContact();
            }

        }

        //User input information


    }


}
