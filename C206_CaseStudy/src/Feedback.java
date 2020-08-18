
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19046751, 11 Aug 2020 3:57:57 pm
 */

public class Feedback {
	
	private String customer;
	private String feedback;
	private String response;
		
	public Feedback(String customer, String feedback, String response) {
		super();
		this.customer = customer;
		this.feedback = feedback;
		this.response = response;
	}


	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String toString() {
		return customer;
		//format string to return			
	}
	
}
