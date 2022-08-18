package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;


public class CreatingContact {
	
  String FirstName , LastName , Address , City , State;
  long mobNum , Zip;
  public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public long getMobNum() {
	return mobNum;
}
public void setMobNum(long mobNum) {
	this.mobNum = mobNum;
}
public long getZip() {
	return Zip;
}
public void setZip(long zip) {
	Zip = zip;
}

@Override
public String toString() {
	return "CreatingContact [FirstName=" + FirstName + ", LastName=" + LastName + ", Address=" + Address + ", City="
			+ City + ", State=" + State + ", mobNum=" + mobNum + ", Zip=" + Zip + "]";
	
	
}
}

  
 
   
 