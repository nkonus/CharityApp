package CST135GroupProject.CharityApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Donor extends Person {	
	//Arraylist of our amount donated
	List <Double> donations = new ArrayList<Double>();
	static Scanner sc = new Scanner(System.in);
	
	
	private double amountDonated;
	private String paymentInfo;
	
	//Donor Constructor
	Donor(double amountDonated, String paymentInfo, String name, String phone, String email, String address){
		super(name, phone, email, address);
		this.amountDonated = amountDonated;
		this.paymentInfo = paymentInfo;
	}
	
	//This method asks the user what type of charity they would like to volunteer to.
	//Each method will have its own choices.
	public void doDonate() {
		System.out.println("Choose a charity type \n 1 For Medical \n 2 For Disaster \n 3 For Poverty  \n 4 For Children");
		int donationInput = sc.nextInt();
		if (donationInput == 1) {medical();}
		else if (donationInput == 2) {disaster();}
		else if (donationInput == 3) {poverty();}
		else if (donationInput == 4) {children();}
		else {}		
		
	}
	//This is the medical method if called.
	//This method has certain charities to call.
	private void medical() {
		System.out.println("Choose a charity \n 1 for Blue Diamond \n 2 for Cancer Curing Society \n 3 for James' Gingivitis  \n 4 for Borders Without Doctors ");
		int medicalInput = sc.nextInt();
		if (medicalInput == 1) {
			//You can use the getCharity method to get the charity, but we hard coded most of them.
			System.out.println("You chose " + Person.charities.get(0));
			//This is used to store their input in an array. 
			paymentAmount(0);}
		else if (medicalInput == 2) {
			System.out.println("You chose Cancer Curing Society");
			 paymentAmount(1);}
		else if (medicalInput == 3) {
			System.out.println("You chose James' Gingivitis");
			 paymentAmount(2);}
		else if (medicalInput == 4) {
			System.out.println("You chose Borders Without Doctors");
			 paymentAmount(3);}
		
	}
	//This method follows the same as medical();
	private void disaster() {
		System.out.println("Choose a charity \n 1 for Purple Rain \n 2 for Oh Snap \n 3 for Direct Relief  \n 4 for Jazzy Jerk James ");
		int disasterInput = sc.nextInt();
		if (disasterInput == 1) {
			System.out.println("You chose Purple Rain");
			paymentAmount(4);}
		else if (disasterInput == 2) {
			System.out.println("You chose Oh Snap");
			paymentAmount(5);}
		else if (disasterInput == 3) {
			System.out.println("You chose Direct Relief");
			paymentAmount(6);}
		else if (disasterInput == 4) {
			System.out.println("You chose Jazzy Jerk James");
			paymentAmount(7);}
		else {}
		
	}
	//This method follows the same as medical();
	private void poverty() {
		System.out.println("Choose a charity \n 1 for Smiling Handouts \n 2 for Helping Hands \n 3 for Care Local  \n 4 for James' Jumping Jamboree");
		int povertyInput = sc.nextInt();
		if (povertyInput == 1) {
			System.out.println("You chose Smiling Handouts");
			paymentAmount(8);}
		else if (povertyInput == 2) {
			System.out.println("You chose Helping Hands");
			paymentAmount(9);}
		else if (povertyInput == 3) {
			System.out.println("You chose Care Local");
			paymentAmount(10);}
		else if (povertyInput == 4) {
			System.out.println("You chose James' Jumping Jamboree");
			paymentAmount(11);}
		else {}
		
	}
	//This method follows the same as medical();
	private void children() {
		System.out.println("Choose a charity \n 1 for Good Vibes \n 2 for Save The Children \n 3 for James' Jammin Jiggly Jammies  \n 4 for Tiny Tim's Tiny Socks");
		int childrenInput = sc.nextInt();
		if (childrenInput == 1) {
			System.out.println("You chose Good Vibes");
			paymentAmount(12);}
		else if (childrenInput == 2) {
			System.out.println("You chose Save The Children");
			paymentAmount(13);}
		else if (childrenInput == 3) {
			System.out.println("You chose James' Jammin Jiggly Jammies");
			paymentAmount(14);}
		else if (childrenInput == 4) {
			System.out.println("You chose Tiny Tim's Tiny Socks");
			paymentAmount(15);}
		else {}
		
	}
	//This method ask the user how much they want donate and stores it in donations
	private void paymentAmount(int test) {
		System.out.println("How much would you like to donate?");
		amountDonated = sc.nextDouble();
		donations.add(amountDonated);
		//Used to calculate the rewards per donation.
		Menu.setPoints(-1 * amountDonated/2);
		System.out.println(this.toString(test));	
		Menu.displayMenu();
		}		
	
	//Had to be done??
	public String toString(int test) {
		return "You have donated $" + amountDonated +  " to " + Person.charities.get(test) + " on " + date;
	}

	//Getters and Setters
	public double getAmountDonated() {
		return amountDonated;
	}
	
	public void setAmountDonated(double amountDonated) {
		this.amountDonated = amountDonated;
	}
	
	public String getPaymentInfo() {
		return paymentInfo;
	}
	
	public void setPaymentInfo(String paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	//Method used to keep track of the amount donated that will later be called.
    public  double calculateAmount() {
    	int i;
    	double sum = 0;
    	for (i = 0; i < donations.size(); i++) { 
    		sum += donations.get(i);
    	}return sum;
    }
}
