package Week03Assignment;

public class Mehtods {

	public static void main(String[] args) {
		
		String firstName = "Bob";
		String lastName = "Ross";
		String fullName = createFullName(firstName, lastName);
		String fullName2 = createFullName("Rick", lastName);
		
		System.out.println(fullName);
		System.out.println(fullName2);

	}
	
	public static String createFullName (String x, String y) {
		return x + " " + y;
		
	}

}
