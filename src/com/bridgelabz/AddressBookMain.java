package com.bridgelabz;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("WELCOME TO ADDRESS BOOK PROGRAM");
        CreatingContact contact = new CreatingContact();
        contact.details();
        contact.printValue();
	}

}
