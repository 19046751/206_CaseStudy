import java.util.ArrayList;
public class BikePartsDB {
	private static ArrayList<BikeParts> bikepartsList = new ArrayList<BikeParts>();

	public static void showBikePartsMenu() {
		//Display the menu
		System.out.println("Option 1: View all Bike Parts");
		System.out.println("Option 2: Add a new Bike Parts");
		System.out.println("Option 3: Delete a Bike Parts");
		System.out.println("Option 4: Exit");
	}	

	public static void addBike(BikeParts bk) {
		//add some data to the lists
		bikepartsList.add(bk);
		if (bikepartsList.size() != 0) {
			System.out.println("Successfully added!");
		}
		else {
			System.out.println("Add fail!");
		}
	}


	public static void viewAllBikeParts() {

		if (bikepartsList.size() == 0) {
			System.out.println("No bike parts.");
		}

		else {
			//display all Customers in the list
			String output = String.format("%-10s %-10s %-10s %-10s\n", "NO.", "PARTNAME", "DESCRIPTION", "AVAILABILITY");
			for (int i = 0; bikepartsList.size() > i; i++) {
				output += String.format("%-10d %-10s %-10s %-10s\n", i + 1, bikepartsList.get(i).getPartName(), bikepartsList.get(i).getDescription(), bikepartsList.get(i).isAvailable());
			}
			System.out.println(output);
		}

	}

	public static void delBike(int BikepartsID) {
		//clean up the data in the list
		bikepartsList.remove(BikepartsID - 1);
	}
	public static void processOption(int subOption) {

		while (subOption != 4) {
			showBikePartsMenu();
			subOption = Helper.readInt("Enter option > ");
			if (subOption == 1) {
				// View all bike part
				viewAllBikeParts();


			} else if (subOption  == 2) {
				// Add a bike part
				BikeParts newBikeparts = inputBikePartsToAdd();

				addBike(newBikeparts);
				for (int i = 0; bikepartsList.size() > i; i++) {
					String newBikeParts = String.format("%-10d %-10s %-10s %-10s\n", i + 1, bikepartsList.get(i).getPartName(), bikepartsList.get(i).getDescription(), bikepartsList.get(i).isAvailable());



				}

				} else if (subOption  == 3) {
					// Delete a bike part
					viewAllBikeParts();
					int delete = selectBikePartsToDelect1();
					int size = bikepartsList.size();
					delBike(delete);
					if (size != bikepartsList.size()) {
						System.out.println("Successfully deleted!");
					}
					else {
						System.out.println("Delete unsuccessful");
					}

				}else if (subOption == 4) {
					System.out.println("End of tasks");
					break;
				}
				//invalid option
				else {
					System.out.println("Invalid type");
				}
			}

			//show the menu again & ask for option
			showBikePartsMenu();


		}



		//==========Option 1 ==============



		//==========Option 2 ==============
		public static BikeParts inputBikePartsToAdd() {
			String partName = Helper.readString("Enter Part Name > ");
			String description = Helper.readString("Enter Description > ");
			boolean isAvailable = Helper.readBoolean("Enter Availability > ");

			BikeParts newBikeparts = new BikeParts(partName, description, isAvailable);
			return newBikeparts;
			//request user for the bike part to add to the list
		}



		//==========Option 3 ==============
		public static int selectBikePartsToDelect1() {
			//request the user to select bike part for process

			int number = Helper.readInt("Enter NO. to delete > ");
			return number;

		}

		public static void delBikeParts(int bikepartsID) {
			//remove bike part to list

		}

		public static void populateBikePartsDB() {
			// TODO Auto-generated method stub

		}

		public static void cleanupBikePartsDB() {
			// TODO Auto-generated method stub

		}

		public static void removeAll() {
			// TODO Auto-generated method stub
			
		}

		public static Object getSize() {
			// TODO Auto-generated method stub
			return null;
		}




	}
