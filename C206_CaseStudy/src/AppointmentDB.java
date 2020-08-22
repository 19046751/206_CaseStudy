
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19044600, Aug 11, 2020 4:08:15 PM
 */

/**
 * @author 19044600
 *
 */
import java.util.ArrayList;

public class AppointmentDB {

	private static ArrayList<Appointment> apptList = new ArrayList<Appointment>();
	
	public static void addAppointment() {
		String date = Helper.readString("Enter date (dd-mmmm-yyyy) > ");
		String time = Helper.readString("Enter time (hhmm)> ");
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

	public static void viewAppointmentList() {

		if (apptList.size() == 0) {
			System.out.println("No customers.");
		}

		else {
			//display all Appointment list
			String output = String.format("%-10s %-10s %-10s %-10s\n", "NO.", "NAME", "DATE", "TIME");
			for (int i = 0; apptList.size() > i; i++) {
				output += String.format("%-10d %-10s %-10s %-10s\n", i + 1, apptList.get(i).getCustomerName(),
						apptList.get(i).getDate(), apptList.get(i).getTime());
			}
			System.out.println(output);
		}

	}

	public static void delAppointment(){
		viewAppointmentList();
		int num = Helper.readInt("Enter NO. to delete > ");
		boolean isDeleted = false;
		
		if (isDeleted == false) {
			apptList.remove(num-1);
			isDeleted = true;
			System.out.println("Successfully deleted!");
		} else {
			System.out.println("Delete unsuccessful.");
		}
	}
	public static void showAppointmentMenu(){
		// Display the menu
		Helper.line(40, "-");
		System.out.println("APPOINTMENT");
		Helper.line(40, "-");
		System.out.println("Option 1: View appointment list");
		System.out.println("Option 2: Add a new appointment");
		System.out.println("Option 3: Delete an existing appointment");
		System.out.println("Option 4: Update an existing appointment");
		System.out.println("Option 5: Search appointment by date");
		System.out.println("Option 5: Exit");
	}
	public static void updateAppointment() {
		viewAppointmentList();
		int num = Helper.readInt("Enter NO. to update > ");
		boolean isUpdated = false;
		
		for(int i = 0; i < apptList.size(); i++) {
			if((i+1) == num) {
				String newDate = Helper.readString("Enter new date (dd-mm-yyyy) > ");
				String newTime = Helper.readString("Enter new time (hhmm)> ");
				apptList.get(i).setDate(newDate);
				apptList.get(i).setTime(newTime);
				isUpdated = true;
				System.out.println("Appointment update successfully!");
			}
		}
		if(isUpdated == false) {
			System.out.println("Update unsuccessfully!");
		}
		
	}
	public static void searchAppointment() {
		String searchDate = Helper.readString("Enter date to search apointment (dd-mm-yyyy) > ");
		String output = "";
		
		for(int i = 0; i < apptList.size(); i++){
			if(searchDate.equals(apptList.get(i).getDate())) {
				output += String.format("%-10s %-10s %-10s %-10s\n", "NO.", "NAME", "DATE", "TIME");
				output += String.format("%-10d %-10s %-10s %-10s\n", i + 1, apptList.get(i).getCustomerName(),
						apptList.get(i).getDate(), apptList.get(i).getTime());
			}
			else {
				System.out.println("There is no appointment on that day!");
			}
			}
		System.out.println(output);
		}
	
	public static void processOption(int subOption) {
		subOption = 0;
		
		while(subOption != 6) {
			showAppointmentMenu();
			subOption = Helper.readInt("Enter option > ");
			
			if(subOption == 1) {
				viewAppointmentList();
			}
			else if(subOption == 2) {
				addAppointment();
			}
			else if(subOption == 3) {
				delAppointment();
			}
			else if(subOption == 4) {
				updateAppointment();
			}
			else if(subOption == 5) {
				searchAppointment();
			}
			else {
				System.out.println("Invalid input");
			}
			
		}
		System.out.println("Goodbye! See you again");
	}
	public static int getSize() {
		return apptList.size();
	}


}
