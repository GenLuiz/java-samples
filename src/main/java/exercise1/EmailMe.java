package exercise1;

public class EmailMe {

	private final static String destiny = "name.manager@wipro.com";
	private final static String subject = "New employee";
	private final static String message = "Welcome the new employee ";
	
	public String getDestiny() {
		return destiny;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public String getMessage() {
		return message;
	}
	
	public static void SendMail(String empName, String empId){
//		TODO: implement me 
		System.out.println("Destiny: " + destiny);
		System.out.println("subject: " + subject);
		System.out.println("EmployeeId: " + empId);
		System.out.println("Message: " + message + empName);
		System.out.println("Manager notified!");
		System.out.println("------------------------------------");
	}
}
