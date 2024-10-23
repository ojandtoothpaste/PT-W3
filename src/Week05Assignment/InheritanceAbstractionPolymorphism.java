package Week05Assignment;

public class InheritanceAbstractionPolymorphism {
	
	public static void main (String[] args) {
		
		Employee salary = new SalariedEmployee("Mike", "Miller", 2500.00);
		Employee hourly = new HourlyEmployee("Tim", "Smith", 15.00, 75.5);
		Employee manager = new Manager("Abe", "Lincoln", 4500.00, 15.5);
		
		System.out.println(salary.calculatePay());
		System.out.println(hourly.calculatePay());
		System.out.println(manager.calculatePay());
		
	}

}
