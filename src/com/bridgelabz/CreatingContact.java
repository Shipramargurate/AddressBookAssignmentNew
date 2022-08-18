package com.bridgelabz;

import java.util.Scanner;


public class CreatingContact {
  String FirstName , LastName , Address , City , State;
  long mobNum , Zip;
  
  Scanner sc = new Scanner(System.in);
   
  public void details()
  {
  System.out.println("Enter first name : ");
	FirstName = sc.nextLine();
	System.out.println("Enter last name : ");
	LastName = sc.nextLine();
	System.out.println("Enter address : ");
	Address = sc.nextLine();
	System.out.println("Enter city name : ");
	City = sc.nextLine();
	System.out.println("Enter state name : ");
	State = sc.next();
	System.out.println("Enter mobile number : ");
	mobNum = sc.nextLong();
	System.out.println("Enter zip code : ");
	Zip = sc.nextLong();
}
  public void printValue() {
	  System.out.println("Enter first name:" + FirstName);
		System.out.println("Enter last name:" + LastName);
		System.out.println("Enter address:" + Address);
		System.out.println("Enter city name:" + City);
		System.out.println("Enter state name:" + State);
		System.out.println("Enter mobile number:" + mobNum);
		System.out.println("Enter zip code:" + Zip);
  }
}