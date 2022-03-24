package com.ContactList;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    ArrayList<ContactList> contactLists = new ArrayList<>();

    public static void main(String[] args) {
	 displayMen();
    }


    public static void displayMen(){

        do{

            System.out.println("Please choose from the following selection \n press 2 add a business contact \n press 2 to a personal contact \n press 3 to display your contact list");

            Scanner sc = new Scanner(System.in);
            int select = sc.nextInt();

            switch (select){
                case 1:
                    //use this to add a business contact
                   // System.out.println("This is a test ot see the code is working");
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

        }while (true);

    }
}
