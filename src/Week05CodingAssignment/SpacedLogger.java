package Week05CodingAssignment;

public class SpacedLogger implements Logger {
	
	// Method to add spaces between each character
	private String addSpaces(String message) {
        return message.chars()
                      .mapToObj(c -> String.valueOf((char)c) + " ")
                      .reduce("", String::concat)
                      .trim();
    }

	@Override
	public void log(String message) {
		System.out.println(addSpaces(message));
		
	}

	@Override
	public void error(String message) {
		System.out.println("Error: " + addSpaces(message));
		
	}

}
