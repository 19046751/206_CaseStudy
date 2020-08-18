import java.util.ArrayList;

public class C206_CaseStudy {

	private static final int OPTION = 4;

	public static void main(String[] args) {

		// insert initial data
		// BikeDB.populateBikeDB();

		int option = 0;

		while (option != OPTION) {

			C206_CaseStudy.showMainMenu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				int subOption = 0;
				CustomerDB.processOption(subOption);
				// Call BikeDB
				// BikeDB.handleBikeOptions();

			} else if (option == 2) {
				// Call BikePartDB menu

			} else if (option == 3) {
				// Call Feedback menu
				int subOption = 0;
				FeedbackDB.processOption(subOption);

			} else if (option == 4) {
				// Call Appointment menu

			} else if (option == 5) {
				// quit

			}

		}

		// clean up data
		// BikeDB.cleanupBikeDB();
	}

	public static void showMainMenu() {
		//insert your menu here
		// TODO Auto-generated method stub
		int option = 0;
		
		while(option != OPTION){
			
			AppointmentDB.showAppointmentMenu();
			option = Helper.readInt("Enter an option > ");
			
			if(option == 1) {
				Appointment.viewAppointmentList();
			}
			else if(option == 2) {
				Appointment.addAppointment();
			}
			else if(option == 3) {
				Appointment.delAppointment();;
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
		String output = "";
		
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
	
