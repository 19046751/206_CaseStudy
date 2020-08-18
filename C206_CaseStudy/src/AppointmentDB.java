
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

	public static void viewAppointmentList() {

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

	}

	public static void delAppointment() {
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
	public static void showAppointmentMenu() {
		// Display the menu
		System.out.println("Option 1: View appointment list");
		System.out.println("Option 2: Add a new appointment");
		System.out.println("Option 3: Delete an existing appointment");
		System.out.println("Option 4: Exit");
	}


}
