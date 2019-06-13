package CST135GroupProject.CharityApp;

import java.util.ArrayList;
import java.util.Date;


public abstract class Person {		
	
	// Attributes for a person, that will be extended to Volunteer and Donor
	private String phone;
	private String name;	
	private String email;
	private String address;
	//Date object for our date
	Date date = new Date();
	
	//Person constructor that MUST have 4 Strings
	//Also used this constructor to add elements to our Array
	Person (String name, String phone, String email, String address){
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		charities.add("Blue Diamond");
        charities.add("Cancer Curing Society");
        charities.add("James's Gingivitis");
        charities.add("Borders Without Doctors");
        charities.add("Purple Rain");
        charities.add("Oh Snap");
        charities.add("Direct Relief");
        charities.add("Jazzy Jerk James");
        charities.add("Smiling Handouts");
        charities.add("Helping Hands");
        charities.add("Care Local");
        charities.add("James' Jumpin Jamboree");
        charities.add("Good Vibes");
        charities.add("Save the Children");
        charities.add("James' Jammin Jiggly Jammies");
        charities.add("Tiny Tims Tiny Socks");
			
	}
	//Our Array of Charities
	static ArrayList<String> charities = new ArrayList<String>();
	
	//This method will get the name of the value of the Array when called.
	//It requires an int because the value being passed through get charity
	//is the place where the value is.
	

	//Getters and Setters
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
