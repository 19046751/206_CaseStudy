import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 19046751, 11 Aug 2020 4:09:10 pm
 */

public class FeedbackTest {

	private Feedback f1;
	private Feedback f2;
	private Feedback f3;
	private Feedback f4;

	private ArrayList<Feedback> allFback;

	public FeedbackTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		// prepare test data
		f1 = new Feedback("The shop has good customer service", "Dylan", null);
		f2 = new Feedback("The shop provides good quality bikes", "Adam", null);
		f3 = new Feedback("The shop sells brand new bike and not second-hand bike", "Bernard", null);
		f4 = new Feedback("The bikes sold are inexpensive and good quality", "Anson", null);

		allFback = new ArrayList<Feedback>();

	}

	@Test
	public void addFeedbackTest() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid feedback arraylist to add to", allFback);
		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		FeedbackDB.addFeedback(f1);
		assertEquals("Check that feedback arraylist size is 1", 1, allFback.size());
		assertSame("Check that Camcorder is added", f1, allFback.get(0));

		// Add another item. test The size of the list is 2? -normal
		// The item just added is as same as the second item of the list
		FeedbackDB.addFeedback(f2);
		assertEquals("Check that feedback arraylist size is 2", 2, allFback.size());
		assertSame("Check that feedback is added", f2, allFback.get(1));

		// Add another item. test The size of the list is 3? -normal
		// The item just added is as same as the second item of the list
		FeedbackDB.addFeedback(f3);
		assertEquals("Check that feedback arraylist size is 3", 3, allFback.size());
		assertSame("Check that feedback is added", f3, allFback.get(2));

		// Add another item. test The size of the list is 3? -normal
		// The item just added is as same as the second item of the list
		FeedbackDB.addFeedback(f4);
		assertEquals("Check that feedback arraylist size is 4", 4, allFback.size());
		assertSame("Check that feedback is added", f4, allFback.get(3));

	}

	public void viewFeedbackTest() {
		assertNotNull("Test if there is valid feedback arraylist to retrieve item", allFback);

		// test if the list of feedbacks retrieved from the SourceCentre is empty -
		// boundary
		String allFeedback = FeedbackDB.viewAllFeedback(allFback);
		String testOutput = "";
		assertEquals("Check that ViewAllCamcorderlist", testOutput, allFeedback);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		// - normal
		FeedbackDB.addFeedback(f1);
		FeedbackDB.addFeedback(f2);
		assertEquals("Test that Camcorder arraylist size is 2", 2, allFback.size());

		// test if the expected output string same as the list of feedbacks retrieved
		// from the SourceCentre
		allFeedback = FeedbackDB.viewAllFeedback(allFback);
		testOutput = String.format("%-10s %-30s\n", "The shop has good customer service", "Dylan");
		testOutput += String.format("%-10s %-30s\n", "The shop gives brand new bikes and not second-hand", "Bernard");

		assertEquals("Test that ViewAllCamcorderlist", testOutput, allFeedback);

	}

}
