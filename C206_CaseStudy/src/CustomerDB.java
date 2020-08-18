import java.util.ArrayList;
// done by boon kai
public class CustomerDB{
	
private static ArrayList<Customer> customerList = new ArrayList<Customer>();
	

	public static int getSize() {
		return customerList.size();
	}
	
	public static void removeAll() {
		customerList.clear();
	}

	//first sprint
	public static void addCustomer(Customer cust) {
		//int size = customerList.size();
		customerList.add(cust);
		if (customerList.size() != 0) {
			System.out.println("Successfully added!");
		}
		else {
			System.out.println("Add fail.");
		}
		
	//add Customer to list
	
	}
	// first sprint
	public static String viewAllCustomer() {
		String output = "";
		if (customerList.size() == 0) {
			output = "No customers.";
		}
		
		else {
		//display all Customers in the list
		 output = String.format("%-10s %-10s %-15s %-15s\n", "NO.", "NAME", "EMAIL", "PHONE");
		for (int i = 0; customerList.size() > i; i++) {
			output += String.format("%-10d %-10s %-15s %-15d\n", i + 1, customerList.get(i).getName(), customerList.get(i).getEmail(), customerList.get(i).getPhone());
		}
		}
		return output;
		
	}
	
	public static void delCustomer(int CustomerID) {
		customerList.remove(CustomerID - 1);
	//remove Customer to list
	
	}
	
	//first sprint
	public static void showCustomerMenu() {
		//Display the menu
		System.out.println("Option 1: View all Customers");
		System.out.println("Option 2: Search by Phone Number");
		System.out.println("Option 3: Add a new Customer");
		System.out.println("Option 4: Delete an existing Customer");
		System.out.println("Option 5: Exit");
	}	
	
	//first sprint
	public static void processOption(int subOption) {
			subOption = 0;
		while (subOption != 5) {
			showCustomerMenu();
			subOption = Helper.readInt("Enter option > ");
			
			if (subOption == 1) {
				// View all Customer
				System.out.println(viewAllCustomer());
			
			} 
			
			else if (subOption == 2) {
				int phoneNo = Helper.readInt("Enter phone number to search > ");
				System.out.println(searchCustomer(phoneNo));
			}
			
			else if (subOption  == 3) {
				Customer newCust = inputCustomerToAdd();
				addCustomer(newCust);
				//add a customer
				
				
				
				
		
			} else if (subOption  == 4) {
				viewAllCustomer();
				if (customerList.size() != 0) {
					int delete = selectCustomerToDelete();
					int size = customerList.size();
					delCustomer(delete);
					if (size != customerList.size()) {
						System.out.println("Successfully deleted!");
					}
					else {
						System.out.println("Delete unsuccessful.");
					}
					// Delete a Customer
				}

				
							
			}else if (subOption == 5) {
				System.out.println("End of tasks");
				break;
			}
				//invalid option
				else {
					System.out.println("Invalid type");
				}
			}
			
			//show the menu again & ask for option
			
			
		}
	
	
	
	//==========Option 1 ==============
	// use viewAllCustomer()
	
	
	//==========Option 2 ==============
	public static Customer inputCustomerToAdd() {
		
		String name = Helper.readString("Enter name > ");
		String email = Helper.readString("Enter email > ");
		int phone = Helper.readInt("Enter number > ");
		
		Customer newCust = new Customer(name, email, phone);
		
		return newCust;
		//request user for the Customer to add to the list	
		
	}
	
		
	//==========Option 3 ==============
	public static int selectCustomerToDelete() {
		int number = Helper.readInt("Enter NO. to delete > ");
		return number;
		//request the user to select Customer for process
	}
	
	//sprint 2
	//======== option to search for phone number ========
	public static String searchCustomer(int phone) {
		String output = String.format("%-10s %-10s %-15s %-15s\n", "NO.", "NAME", "EMAIL", "PHONE");
		boolean found = false;
		for (int i = 0; customerList.size() > i; i++) {
			if (customerList.get(i).getPhone() == phone) {
				found = true;
				output += String.format("%-10d %-10s %-15s %-15s\n",  i + 1 , customerList.get(i).getName(), customerList.get(i).getEmail(), customerList.get(i).getPhone());
			}				
		}
		if (found == true) {
			return output;
		}
		else {
			output = "No customers with that number found.";
			return output;
		}
		
		
		
	}
	
	

}
