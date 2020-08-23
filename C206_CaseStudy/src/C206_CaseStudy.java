import java.util.ArrayList;

public class C206_CaseStudy {
	private static final int OPTION = 5;

	// consolidate all the shit together
	// done by boon kai!
	public static void main(String[] args) {
		// insert your menu here
		// TODO Auto-generated method stub
		int option = Helper.readInt("Enter option > ");


		while (option != OPTION) {
			if (option == 1) { //bikeparts
				int subOption = 0;
				CustomerDB.processOption(subOption);        
			}

		}
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