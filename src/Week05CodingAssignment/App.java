package Week05CodingAssignment;

public class App {

	public static void main(String[] args) {
		
		Logger AsteriskLogger = new AsteriskLogger();
		Logger SpacedLogger = new SpacedLogger();
		
		// Test AsteriskLogger
        System.out.println("AsteriskLogger Log:");
        AsteriskLogger.log("Hello");
        System.out.println("\nAsteriskLogger Error:");
        AsteriskLogger.error("Hello");
        
        // Test SpacedLogger
        System.out.println("\nSpacedLogger Log:");
        SpacedLogger.log("Hello");
        System.out.println("\nSpacedLogger Error:");
        SpacedLogger.error("Hello");
		

	}

}
