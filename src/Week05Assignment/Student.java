package Week05Assignment;

public class Student {
	
	static int numberOfStudents;
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int gradeLevel;
	
	public Student() {}
	
	// Constructors
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Student(String firstName, String lastName, String phoneNumber, int gradeLevel) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.gradeLevel = gradeLevel;
	}
	// Public methods
	
	public void introduce() {
		System.out.println("Hello, my name is " + firstName + " " + lastName);
		System.out.println("I am in grade " + gradeLevel);
		System.out.println("My phone number is " + phoneNumber);
	}
	// Private methods
	private boolean checkLength(String str, int length) {
		return str.length() > length; 
	}
	
	//Getters and Setters
	public void setFirstName(String firstName) { 
		if (checkLength(firstName, 1)) {
			this.firstName = firstName;
		}
	}
	public String getFirstName() {
		return firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	public int getGradeLevel() {
		return gradeLevel;
	}

}
