package Week05CodingAssignment;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
	String errorMessage = "***Error: " + error + "***";
	String border = "*".repeat(errorMessage.length());
	System.out.println(border);
	System.out.println(errorMessage);
	System.out.println(border);
	}

}
