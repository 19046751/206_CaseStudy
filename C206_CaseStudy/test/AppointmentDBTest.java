import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19044600, Aug 11, 2020 4:09:25 PM
 */

/**
 * @author 19044600
 *
 */
public class AppointmentDBTest {
	private Appointment appt1;
	private Appointment appt2;

	private ArrayList<Appointment> apptList;

	@Before
	public void setUp() throws Exception {
		apptList = new ArrayList<Appointment>();
		appt1 = new Appointment("20-5-2020", "14:00", "John");
		appt2 = new Appointment("21-5-2020", "11:00", "Lisa");

		apptList = new ArrayList<Appointment>();
	}
	@Test
	public void viewtest() {
		// Item list is not null, so that can display appointment list
		assertNotNull("Test if there is valid Appointment arraylist to delete to", apptList);

		// Given an empty list, test the appointment list have the size of 0
		assertEquals("Test if that Appointment arraylist size is 0", 0, apptList.size());

		// Given an empty list, after adding 2 item, the size of the list is 2
		C206_CaseStudy.addAppointment(apptList, appt1);
		C206_CaseStudy.addAppointment(apptList, appt2);
		assertEquals("Test if that Appointment arraylist size is 2?", 2, apptList.size());

		// Test if the expected output string same as the list of AppointmentDB
		String viewAll = C206_CaseStudy.viewAppointmentList(apptList);

		String output = String.format("%-10s %-10s %-10s %-10s\n", "NO.", "NAME", "DATE", "TIME");
		for (int i = 0; apptList.size() > i; i++) {
			output += String.format("%-10d %-10s %-10s %-10s\n", i + 1, apptList.get(i).getCustomerName(),
					apptList.get(i).getDate(), apptList.get(i).getTime());
		}
		assertEquals("Check view appointment list", output, viewAll);
	}

	@Test
	public void addAppointmenttest() {

		// Item list is not null, so that can add a new appointment
		assertNotNull("Test if there is valid Appointment arraylist to add to", apptList);

		// Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addAppointment(apptList, appt1);
		assertEquals("Test if that Appointment arraylist size is 1?", 1, apptList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that Appointment is added same as 1st item of the list?", appt1, apptList.get(0));

		// Add another item. test The size of the list is 2?
		C206_CaseStudy.addAppointment(apptList, appt2);
		assertEquals("Test that Camcorder arraylist size is 2?", 2, apptList.size());

	}

	@Test
	public void deletetest(){
		 //Item list is not null, so that can delete a new appointment
		assertNotNull("Test if there is valid Appointment arraylist to delete to", apptList);

		// Test if the appointment able to delete
		C206_CaseStudy.addAppointment(apptList, appt1);
		Boolean isDeleted = C206_CaseStudy.delAppointment(apptList, appt1);
		assertFalse("Test if appointment is deleted", isDeleted);

		 //Test if the ArrayList is updated after delete
		isDeleted = C206_CaseStudy.delAppointment(apptList, appt1);
		assertFalse("Test if appointment is deleted", isDeleted);

	}

}
