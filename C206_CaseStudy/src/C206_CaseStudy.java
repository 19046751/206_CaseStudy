import java.util.ArrayList;

public class C206_CaseStudy {
	private static final int OPTION = 5;

	// consolidate all the shit together
	// done by boon kai!
	//bikes is missing due to only having 4 member
	public static void main(String[] args) {
		// insert your menu here
		// TODO Auto-generated method stub
		
		int option = 0;

		
		int subOption = 0;
		while (option != OPTION) {
			showMenu();
			option = Helper.readInt("Enter option > ");
			if (option == 1) { // customers
				CustomerDB.processOption();        
			}
			else if (option == 2) {
				BikePartsDB.processOption(subOption);
			}
			else if (option == 3) {
				AppointmentDB.processOption(subOption);
			}
			else if (option == 4) {
				FeedbackDB.processOption(subOption);
			}
			else if (option == 5) {
				System.out.println("End of program.");
			}
			
			else System.out.println("Invalid option.");

		}
	}
	
	public static void showMenu() {
		System.out.println("Option 1: Customer Menu");
		System.out.println("Option 2: Bike Part Menu");
		System.out.println("Option 3: Appointment Menu");
		System.out.println("Option 4: Feedback Menu");
		System.out.println("Option 5: Exit Program");
	}

//	public static void addBike(ArrayList<BikeParts> bikepartsList, BikeParts b1) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public static void addBikePartstest(ArrayList<BikeParts> bikepartsList, BikeParts b1) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public static String viewAllBikeParts(ArrayList<BikeParts> bikepartsList) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static void deletetest(ArrayList<BikeParts> bikepartsList, BikeParts b1) {
//		// TODO Auto-generated method stub
//		
//	}




	

	
}