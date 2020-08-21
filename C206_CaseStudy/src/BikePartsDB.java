import java.util.ArrayList;

public class BikePartsDB {

	private static ArrayList<BikeParts> bikepartsList = new ArrayList<BikeParts>();
	
	public static void addBike() {
		String partName = Helper.readString("Enter Part Name > ");
		String description = Helper.readString("Enter Description > ");
		boolean isAvailable = Helper.readBoolean("Enter Availability > ");

		BikeParts newBike = new BikeParts(partName, description, isAvailable);
		bikepartsList.add(newBike);
		
		if(bikepartsList.size() != 0) {
			System.out.println("Successfully added!");
		}
		else {
			System.out.println("Add fail.");
		}
	}

	public static void viewAllBikeParts() {

		if (bikepartsList.size() == 0) {
			System.out.println("No Bike Parts.");
		}

		else {
			// display all Customers in the list
			String output = String.format("%-10s %-10s %-10s %-10s\n", "NO.", "PARTNAME", "DESCRIPTION", "AVAILABILITY");
			for (int i = 0; bikepartsList.size() > i; i++) {
				output += String.format("%-10d %-10s %-10s %-10s\n", i + 1, bikepartsList.get(i).getPartName(),
						bikepartsList.get(i).getDescription(), bikepartsList.get(i).isAvailable());
			}
			System.out.println(output);
		}

	}

	public static void delBike(){
		viewAllBikeParts();
		int num = Helper.readInt("Enter NO. to delete > ");
		boolean isDeleted = false;
		
		if (isDeleted == false) {
			bikepartsList.remove(num-1);
			isDeleted = true;
			System.out.println("Successfully deleted!");
		} else {
			System.out.println("Delete unsuccessful.");
		}
	}
	public static void showBikePartsMenu(){
		// Display the menu
		Helper.line(40, "-");
		System.out.println("BIKE PARTS");
		Helper.line(40, "-");
		System.out.println("Option 1: View Bike Parts list");
		System.out.println("Option 2: Add new Bike Parts");
		System.out.println("Option 3: Delete Bike Parts");
		System.out.println("Option 4: Update Bike Parts");
		System.out.println("Option 5: Exit");
	}
	public static void updateBikeParts() {
		viewAllBikeParts();
		int num = Helper.readInt("Enter NO. to update > ");
		boolean isUpdated = false;
		
		for(int i = 0; i < bikepartsList.size(); i++) {
			if((i+1) == num) {
				boolean newAvailable = Helper.readBoolean("Enter new Availability > ");
				bikepartsList.get(i).setAvailable(newAvailable);
				isUpdated = true;
				System.out.println("Bike Parts availability update successfully!");
			}
		}
		if(isUpdated == false) {
			System.out.println("Update unsuccessfully!");
		}
		
	}
	public static void processOption(int subOption) {
		subOption = 0;
		
		while(subOption != 5) {
			showBikePartsMenu();
			subOption = Helper.readInt("Enter option > ");
			
			if(subOption == 1) {
				viewAllBikeParts();
			}
			else if(subOption == 2) {
				addBike();
			}
			else if(subOption == 3) {
				delBike();
			}
			else if(subOption == 4) {
				updateBikeParts();
			}
			else {
				System.out.println("Invalid input");
			}
			
		}
		System.out.println("Thank you! See you again");
	}

	public static void removeAll() {
		// TODO Auto-generated method stub
		
	}



}
