import java.util.ArrayList;

public class C206_CaseStudy {
	private static final int OPTION = 5;

	public static void main(String[] args) {
		// insert your menu here
		// TODO Auto-generated method stub
		int option = Helper.readInt("Enter option > ");


		while (option != OPTION) {
			if (option == 1) { //bikeparts
				int subOption = 0;
				BikePartsDB.processOption(subOption);        
			}

		}
	}
}