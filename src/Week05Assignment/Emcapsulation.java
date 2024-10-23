package Week05Assignment;

public class Emcapsulation {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setFirstName("Sally");
		student.setPhoneNumber("504");
		student.introduce();
		
		Rectangle rec = new Rectangle(10.0, 15.0);
		System.out.println(rec.getArea());
		
		
		
		/*
		 * Access modifiers:
		 * public - Accessible everywhere
		 * private - Only accessible from within the class itself
		 * protected - Accessible within the class, other classes in the same package and all subclasses
		 * No Modifier - Same as protected except for not accessible in a subclass in a different package
		 */

	}

}
