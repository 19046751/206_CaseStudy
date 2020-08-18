import java.util.ArrayList;

public class C206_CaseStudy {

	private static final int OPTION_QUIT = 5;
	
	public static void main(String[] args) {
		
		//insert initial data
		BikePartsDB.populateBikePartsDB();
		
		int option = 0;
		int subOption = 0;	
		while (option != OPTION_QUIT) {
			BikePartsDB.showBikePartsMenu();
			C206_CaseStudy.showMainMenu();
			option = Helper.readInt("Enter an option > ");
			
			if (option == 1) {
				
				BikePartsDB.processOption(subOption);
				
				
			}else if (option == 2) {
				
				
			}else if (option == 3) {
				
				
			}else if(option == 4) {
				
		
			}else if(option == 5) {
				//quit
				
			}
				
		}
		
		//clean up data
		BikePartsDB.cleanupBikePartsDB();
	}
	
	public static void showMainMenu() {
		//insert your menu here

	}

	public static String viewAllBikeParts() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
