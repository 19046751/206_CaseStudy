import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

public class BikePartsTest{
	private BikeParts b1;
	private BikeParts b2;

	private ArrayList<BikeParts> bikepartsList;

	@Before
	public void setUp() throws Exception {
		bikepartsList = new ArrayList<BikeParts>();
		b1 = new BikeParts("Wheels", "Bike wheels", true);
		b2 = new BikeParts("Handles", "Bike handles", true);

		bikepartsList = new ArrayList<BikeParts>();
	}
	@Test
	public void viewtest() {
		// Item list is not null, so that can display appointment list
		assertNotNull("Test if there is valid BikeParts arraylist to delete to", bikepartsList);

		// Given an empty list, test the appointment list have the size of 0
		assertEquals("Test if that BikeParts arraylist size is 0", 0, bikepartsList.size());

		// Given an empty list, after adding 2 item, the size of the list is 2
		//C206_CaseStudy.addBike(bikepartsList, b1);
		//C206_CaseStudy.addBike(bikepartsList, b2);
		assertEquals("Test if that BikeParts arraylist size is 2?", 2, bikepartsList.size());

		// Test if the expected output string same as the list of AppointmentDB
		//String viewAll = C206_CaseStudy.viewAllBikeParts(bikepartsList);

		String output = String.format("%-10s %-10s %-10s %-10s\n", "NO.", "PARTNAME", "DESCRIPTION", "AVAILABILITY");
		for (int i = 0; bikepartsList.size() > i; i++) {
			output += String.format("%-10d %-10s %-10s %-10s\n", i + 1, bikepartsList.get(i).getPartName(),
					bikepartsList.get(i).getDescription(), bikepartsList.get(i).isAvailable());
		}
		//assertEquals("Check view BikeParts list", output, viewAll);
	}

	@Test
	public void addBikePartstest() {

		// Item list is not null, so that can add a new appointment
		assertNotNull("Test if there is valid BikeParts arraylist to add to", bikepartsList);

		// Given an empty list, after adding 1 item, the size of the list is 1
		//C206_CaseStudy.addBikePartstest(bikepartsList, b1);
		assertEquals("Test if that BikeParts arraylist size is 1?", 1, bikepartsList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that BikeParts is added same as 1st item of the list?", b1, bikepartsList.get(0));

	}

	@Test
	public void deletetest(){
		 //Item list is not null, so that can delete a new appointment
		assertNotNull("Test if there is valid BikeParts arraylist to delete to", bikepartsList);

		// Test if the appointment able to delete
		//C206_CaseStudy.deletetest(bikepartsList, b1);
		//Boolean isDeleted = C206_CaseStudy.deletetest(bikepartsList, b1);
		//assertFalse("Test if BikeParts is deleted", isDeleted);

		 //Test if the ArrayList is updated after delete
		//isDeleted = C206_CaseStudy.deletetest(bikepartsList, b1);
		//assertFalse("Test if BikeParts is deleted", isDeleted);

	}

}