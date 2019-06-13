package CST135GroupProject.CharityApp;

import java.util.Scanner;

public class Menu {
	
	//This class is used for all of our user interface mostly.
static Scanner sc = new Scanner(System.in); 
//Creating our obejcts to access our classes and giving values to our constructors.
static Donor donor = new Donor(0.0, "1212121212121", "John Smith", "5555555555", "JohnSmith@smith.com", "85555");
static Volunteer volunteer = new Volunteer(0.0f, (byte) 0, "John Smith", "5555555555", "JohnSmith@smith.com", "85555");
static double points = 0;


	//Displays the menu
    public static void displayMenu() {
    System.out.println("|=====================================");
    System.out.println("|     Hello! Welcome to ChariT!");
    System.out.println("| Please enter a corresponding number" );
    System.out.println("|");
    System.out.println("| 1. My Profile" );
    System.out.println("|");
    System.out.println("| 2. Volunteer" );
    System.out.println("|");
    System.out.println("| 3. Donate" );
    System.out.println("|");
    System.out.println("| 4. End month & Rewards" );
    System.out.println("|");
    System.out.println("| 5. Exit" );    
    System.out.println("|=====================================");
    int displayMenuInput = sc.nextInt();
     if (displayMenuInput == 1) {displayProfile();}
	 if (displayMenuInput == 2) { volunteer.doVolunteer();}
	 else if (displayMenuInput == 3) { donor.doDonate();}
	 else if (displayMenuInput == 4) {  rewards();}	 
	 else {}
    }
    
    //This method creates a user account and stores the info.
    public static void profile(){
    	System.out.println("To continue, please create a profile!");
    	System.out.println("Please enter your Name");
        donor.setName(sc.nextLine()); 
    	System.out.println("Please enter your Phone");
    	donor.setPhone(sc.nextLine());
    	System.out.println("Please enter your Email");
    	donor.setEmail(sc.nextLine());
    	System.out.println("Please enter your Zipcode");
    	donor.setAddress(sc.nextLine());     	
}
    //Just displays the info inputed for profile();
    public static void displayProfile() {
    	System.out.println("Name on file: " + donor.getName());
    	System.out.println("Phone on file: " + donor.getPhone());
    	System.out.println("Email on file: " + donor.getEmail());
    	System.out.println("Zipcode on file: " + donor.getAddress());
    	displayMenu();
    }
    //This method calculates rewards and allows the user to exchange rewards to prizes!!
    public static void rewards() {
    	System.out.println("You have donated " + donor.calculateAmount() + " dollars this month!");
    	System.out.println("You have volunteered " + volunteer.calculateTime() + " hours this month!");
    	System.out.println("You have earned " + points + " points available.");
    	System.out.println("Would you like to redeem any points for this month?");
    	System.out.println("Enter 1 for yes and 2 for no.");
    	int redeemInput = sc.nextInt();
    	if (redeemInput == 1 ) {
    		
    		if (points > 100 && points < 200) {
    			System.out.println("Choose a reward");
    			System.out.println("1. T-Shirt");
    			System.out.println("2. Tote Bag");
    			System.out.println("3. KeyChain/Decal");
    			int prize = sc.nextInt();
    				if (prize == 1) {
    					System.out.println("You chose a T-shirt!");
    				}else if (prize == 2) {
    					System.out.println("You chose a Tote Bag!");
    				}else if(prize == 3) {
    					System.out.println("You chose a Keychain/Decal!");
    				}else System.out.println("not good");
    			setPoints(100);	
    			System.out.println("You have " + getPoints() + " points left.");
    		}		

    		
    		else if (points > 200 && points < 500 ) {
    			System.out.println("Choose a reward");
    			System.out.println("1. Hoodie");
    			System.out.println("2. Personalized KeepCool waterbottle");
    			System.out.println("3. Computer Mouse");
    			int prize2 = sc.nextInt();
    			if (prize2 == 1) {
					System.out.println("You chose a Hoodie");
				}else if (prize2 == 2) {
					System.out.println("You chose a Personalized KeepCool Waterbottle");
				}else if(prize2 == 3) {
					System.out.println("You chose a Computer Mouse!");
				}else System.out.println("not good");
    			setPoints(200);	
    			System.out.println("You have " + getPoints() + " points left.");

    		}
    		else if (points >= 500 ) {
    			System.out.println("Choose a reward");
    			System.out.println("1. Dinner for two");
    			System.out.println("2. Event Tickets");
    			System.out.println("3. Custom Plaque");
    			int prize3 = sc.nextInt();
    			if (prize3 == 1) {
					System.out.println("You chose a Dinner for Two!");
				}else if (prize3 == 2) {
					System.out.println("You chose a Event Tickets!");
				}else if(prize3 == 3) {
					System.out.println("You chose a Custom Plaque!");
				}else System.out.println("not good");
    			setPoints(500);	
    			System.out.println("You have " + getPoints() + " points left.");

    		}else System.out.println("I am sorry, you do not have enough points to do anything.");
    		displayMenu(); 
    			
    	}else;
    		
    	displayMenu();
    }
    
    public static double getPoints() {
	return points;
}

public static void setPoints(double p) {
	points = points - p;
}
}

