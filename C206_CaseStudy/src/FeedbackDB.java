import java.util.ArrayList;

/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 19046751, 11 Aug 2020 3:58:10 pm
 */

public class FeedbackDB {

	private static ArrayList<Feedback> fbList = new ArrayList<Feedback>();

	public static void addFeedback(Feedback fb) {
		fbList.add(fb);
		if (fbList.size() != 0) {
			System.out.println("Successfully added!");
		} else {
			System.out.println("Add fail.");
		}
	}

	public static void viewAllFeedback() {
		if (fbList.size() == 0) {
			System.out.println("No feedbacks.");
		} else {
			String output = String.format("%-5s %-15s%-20s%-20s\n", "NO.", "CUSTOMER", "FEEDBACK", "RESPONSES");
			output += String.format("%-5s %-15s%-20s%-20s\n", "===", "========", "========", "=========");
			for (int i = 0; fbList.size() > i; i++) {
				output += String.format("%-5d %-15s %-20s %-20s\n", i + 1, fbList.get(i).getCustomer(),
						fbList.get(i).getFeedback(), fbList.get(i).getResponse());
			}
			System.out.println(output);
		}
	}

	public static void delFeedback(int feedbackID) {
		fbList.remove(feedbackID - 1);
	}

	public static void showFeedback() {
		System.out.println("1. View all Feedback");
		System.out.println("2. Add new feedback");
		System.out.println("3. Delete a feedback");
		System.out.println("5. Exit");
	}

	public static void processOption(int subOption) {
		subOption = 0;
		while (subOption != 4) {
			showFeedback();
			subOption = Helper.readInt("Enter option > ");

			if (subOption == 1) {
				viewAllFeedback();

			}

			else if (subOption == 2) {
				Feedback newFB = inputFeedbacktoAdd();
				addFeedback(newFB);

			}

			else if (subOption == 3) {
				viewAllFeedback();
				int delete = selectFeedbacktoDelete();
				int size = fbList.size();
				delFeedback(delete);

				if (size != fbList.size()) {
					System.out.println("Successfully deleted!");
				} else {
					System.out.println("Delete unsuccessful.");
				}

			} 
			
			else if (subOption == 4) {
				System.out.println("End of tasks");
				break;
			}
			else {
				System.out.println("Invalid type");
			}
		}
	}
	
	public static Feedback inputFeedbacktoAdd() {
		
		String name = Helper.readString("Enter Name > ");
		String feedback = Helper.readString("Enter Feedback > ");
		String response = Helper.readString("Enter Response > ");
		
		Feedback newFB = new Feedback(name, feedback, response);
		
		return newFB;
		
	}
	
	public static int selectFeedbacktoDelete() {
		int number = Helper.readInt("Enter No. to delete > ");
		return number;
	}

}
