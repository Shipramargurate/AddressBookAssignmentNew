package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
	static Scanner sc = new Scanner(System.in);
    static  ArrayList<CreatingContact> addingContact= new ArrayList<>(); 
   
public void addContact() {
	
	 System.out.println("enter the number of person you want to add");
	 int num = sc.nextInt();
	 for (int i = 0; i < num; i++) {
		 CreatingContact contact = new CreatingContact();
		 
		 System.out.println("Enter First Name :");
        contact.setFirstName(sc.next());	
        
        System.out.println("Enter Last Name : ");
        contact.setLastName(sc.next());
        
        System.out.println("Enter Adress : ");
        contact.setAddress(sc.next());
        
        System.out.println("Enter a City name:");
        contact.setCity(sc.next());

		System.out.println("Enter a state:");
	    contact.setState(sc.next());

		System.out.println("Enter a zip code:");
	    contact.setZip(sc.nextLong());

		System.out.println("Enter a phone number:");
	     contact.setMobNum(sc.nextLong());
			addingContact.add(contact);
			}
				System.out.print(addingContact);
				
		
		}
	public static void main(String[] args) {
		System.out.println("WELCOME TO ADDRESS BOOK PROGRAM");
		AddressBookMain addressbook = new AddressBookMain();
        addressbook.addContact();
	}

}
