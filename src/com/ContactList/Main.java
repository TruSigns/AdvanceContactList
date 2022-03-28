package com.ContactList;

import java.security.spec.ECField;
import java.util.*;

public class Main {

    public static ArrayList<Contact> contacts = new ArrayList<>();


    public static void main(String[] args) {
        displayMenu();
        System.out.println("Have a good day! Shutting down....");
    }



    public static void displayMenu() {

       boolean exit;


        do {

            System.out.println("Please choose from the following selection \n press 1 add a  contact \n press 2 to a view contact \n press 3 to exit your contact list");

            Scanner sc = new Scanner(System.in);
            int select = sc.nextInt();

            switch (select) {
                case 1:
                   //This is to add a personal or business contact
                    addContact();
                case 2:
                    //this is view the people in your contact list
                    viewContacts();


                    break;
                default:
                    exit = false;
                    //this is to quit the program
            }
        } while(!true);

    }

    public static void contactInput(){

        Scanner sc = new Scanner(System.in);

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

        System.out.println("The following information you enter was : " + firstName + " " + lastName + " " + address + "" +
                " " + phoneNumber + " " + email + " is this information is correct, then please press Y");


        String confirm;

        do {

            confirm = sc.next().toUpperCase(Locale.ROOT);

            if (confirm.equals("Y")) {
                System.out.println("Saving Information.....");
                contacts.add(new Contact(firstName, lastName, address, phoneNumber, email));
            } else {
                System.out.println("That was an invalid entry, please press Y to save data");
            }

        } while (!confirm.equals("Y"));

        //ask for confirmation

    }



    public static void addContact() {
        Scanner sc = new Scanner(System.in);
        //ask the user if they want a personal or business contac

        try{

            System.out.println("Please 1 if you want to add a personal contact or press 2 for business");
            int select = sc.nextInt();

            if (select == 1) {
                contactInput();
            } else if (select == 2) {
                contactInput();
            }
        }catch (InputMismatchException e){
            System.out.println("This is an invalid input");


        }


    }

    public static void viewContacts(){
        for(int i = 0; i < contacts.size() ; i++){
            System.out.println(contacts.get(i));
        }
    }


}
