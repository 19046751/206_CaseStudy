import java.util.ArrayList;

public class C206_CaseStudy {

<<<<<<< HEAD
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
=======
	private static final int OPTION = 4;
>>>>>>> branch 'master' of https://github.com/19046751/W67Q-Team3.git

	public static void main(String[] args) {
			//insert your menu here
			// TODO Auto-generated method stub
			int option = 0;
			
			while(option != OPTION) {
				
				AppointmentDB.showAppointmentMenu();
				option = Helper.readInt("Enter an option > ");
				
				if(option == 1) {
					AppointmentDB.viewAppointmentList();
				}
				else if(option == 2) {
					AppointmentDB.addAppointment();
				}
				else if(option == 3) {
					AppointmentDB.delAppointment();;
				}	
			}
			System.out.println("GoodBye! See You Again!");
		}

		/**
		 * @param apptList
		 * @param appt1
		 */
		public static void addAppointment(ArrayList<Appointment> apptList, Appointment appt1) {
			// TODO Auto-generated method stub
			String date = Helper.readString("Enter date > ");
			String time = Helper.readString("Enter time > ");
			String name = Helper.readString("Enter name > ");

			Appointment newCust = new Appointment(date, time, name);
			apptList.add(newCust);
			
			if(apptList.size() != 0) {
				System.out.println("Successfully added!");
			}
			else {
				System.out.println("Add fail.");
			}
		}

		public static Boolean delAppointment(ArrayList<Appointment> apptList, Appointment appt1) {
			// TODO Auto-generated method stub
			Appointment.viewAppointmentList();
			int num = Helper.readInt("Enter NO. to delete > ");
			boolean isDeleted = false;
			
			if (isDeleted == false) {
				apptList.remove(num-1);
				isDeleted = true;
				System.out.println("Successfully deleted!");
			} else {
				System.out.println("Delete unsuccessful.");
			}
			return null;
		}

		public static String viewAppointmentList(ArrayList<Appointment> apptList) {
			// TODO Auto-generated method stub
			if (apptList.size() == 0) {
				System.out.println("No customers.");
			}
			else {
				// display all Customers in the list
				String output = String.format("%-10s %-10s %-10s %-10s\n", "NO.", "NAME", "DATE", "TIME");
				for (int i = 0; apptList.size() > i; i++) {
					output += String.format("%-10d %-10s %-10s %-10s\n", i + 1, apptList.get(i).getCustomerName(),
							apptList.get(i).getDate(), apptList.get(i).getTime());
				}
				System.out.println(output);
			}
			return null;
		}
	}

<<<<<<< HEAD
	public static String viewAllBikeParts() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
=======
>>>>>>> branch 'master' of https://github.com/19046751/W67Q-Team3.git
