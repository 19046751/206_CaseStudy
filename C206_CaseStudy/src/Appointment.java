/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19044600, Aug 11, 2020 4:06:30 PM
 */

/**
 * @author 19044600
 *
 */

public class Appointment extends AppointmentDB{
	//declare class parameters
	private String date;
	private String time;
	private String customerName;
		
	public Appointment(String date, String time, String customerName) {
		super();
		this.date = date;
		this.time = time;
		this.customerName = customerName;
	}	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public String toString() {
		//format string to return
		String output = "";
		return output;
	}

}


