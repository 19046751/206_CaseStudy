import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	//boon kai
	private Customer c1;
	private Customer c2;

	@Before
	public void setUp() throws Exception {
		//boon kai
		 c1 = new Customer("kai", "kai@abc.com", 80001234);
		 c2 = new Customer("aly", "aly@abc.com", 81234567);
		
	}


	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	@Test
	//boon kai
	public void checkForArrayList() {
		assertEquals("checks if arrayList size is 0, if there is means an arraylist is present or else there will be another error.", 0, CustomerDB.getSize());
	}
	
	@Test
	//boon kai
	public void addCustomerTest() {
		CustomerDB.addCustomer(c1);
		CustomerDB.addCustomer(c2);
		assertEquals("If the size is 2 after adding, means successful added.", 2, CustomerDB.getSize());
	}
	
	
	
	@Test	
	//boon kai
	public void viewCustomerTest() {
		
		//checks if there is an arraylist with the size
		checkForArrayList();
		
		//checks for output first if no customer added
		assertEquals("checks for output when there is no customer.", "No customers.", CustomerDB.viewAllCustomer());
		
		
		//checks if arraylist is there and also tests if adding is working
		addCustomerTest();
		
		String output = String.format("%-10s %-10s %-15s %-15s\n", "NO.", "NAME", "EMAIL", "PHONE");
		output += String.format("%-10d %-10s %-15s %-15d\n", 1, "kai", "kai@abc.com", 80001234);
		output += String.format("%-10d %-10s %-15s %-15d\n", 2, "aly", "aly@abc.com", 81234567);
		
		assertEquals("Check if string output is the same for viewCustomers after adding customers.", output, CustomerDB.viewAllCustomer());
		
		
	}
	@Test
	//boon kai
	public void deleteCustomerTest() {
		//adds and check first
		checkForArrayList();
		addCustomerTest();
		CustomerDB.delCustomer(2);
		assertEquals("Check if array size is 1. if its 1 means 1 of them has been deleted.", 1, CustomerDB.getSize());
		CustomerDB.delCustomer(1);
		assertEquals("Check if array size is 0. if its 0 means it has been deleted.", 0, CustomerDB.getSize());
		
	}
	
	@Test
	//boon kai 
	public void searchCustomerByPhoneTest() {
		checkForArrayList();
		addCustomerTest();
		String output = "No customers with that number found.";
		assertEquals("Checks if its not found if there is no number found", output, CustomerDB.searchCustomer(80005678));
		output = String.format("%-10s %-10s %-15s %-15s\n", "NO.", "NAME", "EMAIL", "PHONE");
		output += String.format("%-10d %-10s %-15s %-15d\n", 1, "kai", "kai@abc.com", 80001234);
		assertEquals("Checks if a number is found with validity.", output, CustomerDB.searchCustomer(80001234));
	}
	
	@After
	public void tearDown() throws Exception {
		//boon kai
		c1 = null;
		c2 = null;
		CustomerDB.removeAll();
		
	}

}
