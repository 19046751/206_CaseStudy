import static org.junit.Assert.*;

import java.util.ArrayList;
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
	//private Appointment appt1;
	//private Appointment appt2;

	//@Before
	//public void setUp() throws Exception {
		
	//}

	@Test
	public void viewtest(){

		// Appointment list has 2 appointment, test the appointment list have the size of 2
		assertEquals("Test if that Appointment arraylist size is 0", 2, Appointment.getSize());

		// Appointment list is not null, so that can display appointment list
		assertNotNull("Test if there is valid Appointment arraylist to delete to", Appointment.getSize());

		// Given an empty list, after adding 2 item, the size of the list is 2
		
		assertEquals("Test if that Appointment arraylist size is 2?", 2, Appointment.getSize());
		
		// Test the output have 2 appointment
		AppointmentDB.viewAppointmentList();
		
	}

	@Test
	public void addAppointmenttest() {

		// Given an empty list, after adding 1 item, the size of the list is 1
		AppointmentDB.addAppointment();
		assertEquals("Test if that Appointment arraylist size is 1?", 1, Appointment.getSize());

		// Add another item. test The size of the list is 2?
		AppointmentDB.addAppointment();
		assertEquals("Test that Appointment arraylist size is 2?", 2, Appointment.getSize());

	}

	 @Test
	 public void deletetest(){
	// Item list is not null, so that can delete a new appointment
	 assertNotNull("Test if there is valid Appointment arraylist to delete to", Appointment.getSize());

	// Given that there are 2 appointment in the list, test if there is only 1 appointment after delete 
	 AppointmentDB.delAppointment();;
	 assertEquals("Test that Appointment arraylist size is 1 after delete?", 1, Appointment.getSize());

	 }
	 @Test
	 public void updatetest(){
		// Item list is not null, so that can update a new appointment
		 assertNotNull("Test if there is valid Appointment arraylist to update to", Appointment.getSize());
		 
	 }
	 
}
