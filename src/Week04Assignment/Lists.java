package Week04Assignment;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		
		String[] cars = new String[3];
		cars[0] = "Camaro";
		cars[1] = "F150";
		cars[2] = "Mustang";
		
		//List<String> reads as List of Strings
		List<String> sports = new ArrayList<String>();
		sports.add("Football");
		sports.add("Softball");
		sports.add("Baseball");
		sports.remove(1);
		
		for (int i = 0; i < sports.size(); i++) {
			System.out.println(sports.get(i));
		}
		for (String sport : sports) {
			System.out.println(sport);
		}
		

	}

}
