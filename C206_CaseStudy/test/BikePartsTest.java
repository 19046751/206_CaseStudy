import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

public class BikePartsTest {
	
	private BikeParts bp1;
	private BikeParts bp2;

	@Before
	public void setUp() throws Exception {
		bp1 = new BikeParts("Wheels", "Bike Wheels", true);
		bp2 = new BikeParts("Handle", "Bike Handles", true);
	}
		
	@Test
	public void c206_test() {

		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	@Test

	public void checkForArrayList() {
		assertEquals("checks if arrayList size is 0, if there is means an arraylist is present or else there will be another error.", 0, BikePartsDB.getSize());
	}
	
	@Test

	public void addBikeTest() {
		BikePartsDB.addBike(bp1);
		BikePartsDB.addBike(bp2);
		assertEquals("If the size is 2 after adding, means successful added.", 2, BikePartsDB.getSize());
	}
	
	
	
	@Test	

	public void viewBikeTest() {
		
		//checks if there is an arraylist with the size
		checkForArrayList();
		
		//checks for output first if no customer added
		
		
		
		//checks if arraylist is there and also tests if adding is working
		addBikeTest();
		
		String output = String.format("%-10s %-10s %-15s %-15s\n", "NO.", "PARTNAME", "DESCRIPTION", "AVAILABILITY");
		output += String.format("%-10d %-10s %-15s %-15d\n", 1, "Wheels", "Bike Wheels", true);
		output += String.format("%-10d %-10s %-15s %-15d\n", 2, "Handles", "Bike Handles", true);
		
		
		
	}


	@Test

	public void deleteBikeTest() {
		//adds and check first
		checkForArrayList();
		addBikeTest();
		BikePartsDB.delBike(2);
		assertEquals("Check if array size is 1. if its 1 means 1 of them has been deleted.", 1, BikePartsDB.getSize());
		BikePartsDB.delBike(1);
		assertEquals("Check if array size is 0. if its 0 means it has been deleted.", 0, BikePartsDB.getSize());
		
	}
	
	
	@After
	public void tearDown() throws Exception {

		bp1 = null;
		bp2 = null;
		BikePartsDB.removeAll();
		
	}

}
