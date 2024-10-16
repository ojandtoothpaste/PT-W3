package Week04Assignment;

public class StringAndStringBuilder {

	public static void main(String[] args) {
		String firstName = "Gabe";
		String lastName = "Swenson";
		System.out.println(firstName + " " + lastName);
		
		String tripleHi = multiplyString("Hi ", 3);
		System.out.println(tripleHi);
		
		firstName = firstName.concat(lastName);
		System.out.println(firstName);
		
		StringBuilder fullName = new StringBuilder("Sam");
		fullName.append(" Smith");
		System.out.println(fullName.toString());
		
		System.out.println(fullName.charAt(5));
		//System.out.println(fullName.deleteCharAt(5));
		//System.out.println(fullName.delete(1, 3));
		System.out.println(fullName.indexOf("it"));
		
	}
	
	public static String multiplyString(String str, int num) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < num; i++) {
			result.append(str);
		}
		return result.toString();
	}

}

