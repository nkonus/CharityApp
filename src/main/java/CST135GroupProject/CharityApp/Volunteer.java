package CST135GroupProject.CharityApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Volunteer extends Person{
	//Arraylist of time donated stored in an arraylist to track
	List<Float> timeVolunteered = new ArrayList<Float>();
	private float timeDonated;
	private byte radiusLocation;
	static Scanner sc = new Scanner(System.in);
	
	//Volunteer constructor
	Volunteer(float timeDonated, byte radiusLocation, String name, String phone, String email, String address){
		super(name, phone, email, address);
		this.timeDonated = radiusLocation;
		this.radiusLocation = radiusLocation;
	}
	//This method will ask how far the user is willing to travel and based on input
	//Will return certain values.
	private byte radius() {		
		System.out.println("Please enter the distance you would travel to volunteer between 0 and 50.");
		setRadiusLocation((byte) sc.nextInt());
		return (byte) radiusLocation;
	}
	//Does the same thing that doDonate does
	public void doVolunteer() {
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
		this.radius();
		if (radiusLocation <=10) {
			System.out.println("Choose a charity \n 1 for Blue Diamond \n 2 for Cancer Curing Society");
			int medicalInput = sc.nextInt();
			if (medicalInput == 1) {				
				System.out.println("You chose " + charities.get(0));
				timeVolunteered(0);}
			else if (medicalInput == 2) {
				System.out.println("You chose" + charities.get(1));
				timeVolunteered(1);}
		}
		else if(radiusLocation >10 && radiusLocation <= 20) {
			System.out.println("Choose a charity \n 1 for Blue Diamond \n 2 for Cancer Curing Society \n 3 for James' Gingivitis");
			int medicalInput = sc.nextInt();
			if (medicalInput == 1) {
				System.out.println("You chose " + charities.get(0));
				timeVolunteered(2);}
			else if (medicalInput == 2) {
				System.out.println("You chose " + charities.get(1));
				timeVolunteered(3);}
			else if (medicalInput == 3) {
				System.out.println("You chose " + charities.get(2));
				timeVolunteered(4);}
		}
		else if (radiusLocation <=50 && radiusLocation > 20) {
				System.out.println("Choose a charity \n 1 for Blue Diamond \n 2 for Cancer Curing Society \n 3 for James' Gingivitis  \n 4 for Borders Without Doctors ");
				int medicalInput = sc.nextInt();
				if (medicalInput == 1) {
					System.out.println("You chose " + charities.get(0));
					timeVolunteered(5);}
				else if (medicalInput == 2) {
					System.out.println("You chose " + charities.get(1));
					timeVolunteered(6);}
				else if (medicalInput == 3) {
					System.out.println("You chose " + charities.get(2));
					timeVolunteered(7);}
				else if (medicalInput == 4) {
					System.out.println("You chose " + charities.get(3));
					timeVolunteered(8);}
		}else System.out.println("You did not enter a valid input. Please try again");
			Menu.displayMenu();
	}
	//This method follows the same as medical();
	private void disaster() {
		this.radius();
		if (radiusLocation <=10) {
			System.out.println("Choose a charity \n 1 for Purple Rain \n 2 for Oh Snap");
			int medicalInput = sc.nextInt();
			if (medicalInput == 1) {
				System.out.println("You chose " + charities.get(4));
				timeVolunteered(9);}
			else if (medicalInput == 2) {
				System.out.println("You chose " + charities.get(5));
				timeVolunteered(10);}
		}
		else if(radiusLocation >10 && radiusLocation <= 20) {
			System.out.println("Choose a charity \n 1 for Purple Rain \n 2 for Oh Snap \n 3 for Direct Relief");
			int medicalInput = sc.nextInt();
			if (medicalInput == 1) {
				System.out.println("You chose " + charities.get(4));
				timeVolunteered(11);}
			else if (medicalInput == 2) {
				System.out.println("You chose " + charities.get(5));
				timeVolunteered(12);}
			else if (medicalInput == 3) {
				System.out.println("You chose " + charities.get(6));
				timeVolunteered(13);}
		}
		else if (radiusLocation <=50 && radiusLocation > 20) {
				System.out.println("Choose a charity \n 1 for Purple Rain \n 2 for Oh Snap \n 3 for Direct Relief  \n 4 for Jazzy Jerk James ");
				int medicalInput = sc.nextInt();
				if (medicalInput == 1) {
					System.out.println("You chose " + charities.get(4));
					timeVolunteered(14);}
				else if (medicalInput == 2) {
					System.out.println("You chose " + charities.get(5));
					timeVolunteered(15);}
				else if (medicalInput == 3) {
					System.out.println("You chose " + charities.get(6));
					timeVolunteered(16);}
				else if (medicalInput == 4) {
					System.out.println("You chose " + charities.get(7));
					timeVolunteered(17);}
		}else System.out.println("You did not enter a valid input. Please try again");
			Menu.displayMenu();
	}
	//This method follows the same as medical();
	private void poverty() {
		this.radius();
		if (radiusLocation <=10) {
			System.out.println("Choose a charity \n 1 for Smiling Handout's \n 2 for Helping Hand's");
			int medicalInput = sc.nextInt();
			if (medicalInput == 1) {
				System.out.println("You chose " + charities.get(8));
				timeVolunteered(18);}
			else if (medicalInput == 2) {
				System.out.println("You chose " + charities.get(9));
				timeVolunteered(19);}
		}
		else if(radiusLocation >10 && radiusLocation <= 20) {
			System.out.println("Choose a charity \n 1 for Smiling Handout's \n 2 for Helping Hand's \n 3 for Care Local");
			int medicalInput = sc.nextInt();
			if (medicalInput == 1) {
				System.out.println("You chose " + charities.get(8));
				timeVolunteered(20);}
			else if (medicalInput == 2) {
				System.out.println("You chose " + charities.get(9));
				timeVolunteered(21);}
			else if (medicalInput == 3) {
				System.out.println("You chose " + charities.get(10));
				timeVolunteered(22);}
		}
		else if (radiusLocation <=50 && radiusLocation > 20) {
				System.out.println("Choose a charity \n 1 for Smiling Handout's \n 2 for Helping Hand's \n 3 for Care Local  \n 4 for James' Jumping Jamboree ");
				int medicalInput = sc.nextInt();
				if (medicalInput == 1) {
					System.out.println("You chose " + charities.get(9));
					timeVolunteered(23);}
				else if (medicalInput == 2) {
					System.out.println("You chose " + charities.get(10));
					timeVolunteered(24);}
				else if (medicalInput == 3) {
					System.out.println("You chose " + charities.get(11));
					timeVolunteered(25);}
				else if (medicalInput == 4) {
					System.out.println("You chose " + charities.get(12));
					timeVolunteered(26);}
		}else System.out.println("You did not enter a valid input. Please try again");
			Menu.displayMenu();
	}
	//This method follows the same as medical();
	private void children() {
		this.radius();
		if (radiusLocation <=10) {
			System.out.println("Choose a charity \n 1 for Good Vibes \n 2 for Save the Children");
			int medicalInput = sc.nextInt();
			if (medicalInput == 1) {
				System.out.println("You chose " + charities.get(13));
				timeVolunteered(27);}
			else if (medicalInput == 2) {
				System.out.println("You chose " + charities.get(14));
				timeVolunteered(28);}
		}
		else if(radiusLocation >10 && radiusLocation <= 20) {
			System.out.println("Choose a charity \n 1 for Good Vibes \n 2 for Save the Children \n 3 for James' Jammin Jiggly Jammies");
			int medicalInput = sc.nextInt();
			if (medicalInput == 1) {
				System.out.println("You chose " + charities.get(13));
				timeVolunteered(29);}
			else if (medicalInput == 2) {
				System.out.println("You chose " + charities.get(14));
				timeVolunteered(30);}
			else if (medicalInput == 3) {
				System.out.println("You chose " + charities.get(15));
				timeVolunteered(31);}
		}
		else if (radiusLocation <=50 && radiusLocation > 20) {
				System.out.println("Choose a charity \n 1 for Good Vibes \n 2 for Save the Children \n 3 for James' Jammin Jiggly Jammies  \n 4 for Tiny Tim's Tiny Socks ");
				int medicalInput = sc.nextInt();
				if (medicalInput == 1) {
					System.out.println("You chose " + charities.get(13));
					timeVolunteered(32);}
				else if (medicalInput == 2) {
					System.out.println("You chose " + charities.get(14));
					timeVolunteered(33);}
				else if (medicalInput == 3) {
					System.out.println("You chose " + charities.get(15));
					timeVolunteered(34);}
				else if (medicalInput == 4) {
					System.out.println("You chose " + charities.get(16));
					timeVolunteered(35);}
		}else System.out.println("You did not enter a valid input. Please try again"); 
			Menu.displayMenu();
		
	}
	//Keeps track of time volunteered to track points
	private void timeVolunteered(int test) {
		System.out.println("How much time would you like to volunteer?");
		timeDonated = sc.nextFloat();
		timeVolunteered.add(timeDonated);
		Menu.setPoints(-1 * timeDonated);
		System.out.println	(this.toString(test));
		Menu.displayMenu();
	}	
	
	public String toString(int test) {
		
		return "You have volunteered " + timeVolunteered +  " hours to " + charities.get(test) + " on " + date;
	}
	
	public float getTimeDonated() {
		return timeDonated;
	}
	public void setTimeDonated(float timeDonated) {
		this.timeDonated = timeDonated;
	}
	public byte getRadiusLocation() {
		return radiusLocation;
	}
	public void setRadiusLocation(byte radiusLocation) {
		this.radiusLocation = radiusLocation;
	}
	//Adds up all time of the array
    public double calculateTime() {
    	int j;
    	double sum2 = 0;
    	for (j = 0; j < timeVolunteered.size(); j++)
    		sum2 += timeVolunteered.get(j);
    	return sum2;
}	
  

}
