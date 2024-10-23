package Week04Assignment;

public class CodingProject {

	public static void main(String[] args) {
		//ages array
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//Subtract the first element from the last element
		int difference = ages[ages.length - 1] - ages[0];
		System.out.println(difference);
		
		//New array with 9 elements
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 45};
		int dynamicDifference = ages2[ages2.length - 1] - ages2[0]; //repeat subtraction with dynamic indices
		System.out.println(dynamicDifference);
		
		//calculate average age using a loop
		int sum = 0; 
		for (int age : ages2) {
			sum += age;
		}
		double average = (double) sum / ages2.length;
		System.out.println(average);
		
		//2. Array of names
		String[] names = {"Gabe", "Tommy", "Leo", "Dana", "Buck", "Rob"};
		
		//Calculate the average number of letters per name
		int totalLetters = 0;
		for (String name : names) {
			totalLetters += name.length(); //add the letters of each name
		}
		double averageLetters = (double) totalLetters / names.length;
		System.out.println(averageLetters);
		
		//Concatenate all the names together, separated by spaces
		String concatenatedNames = "";
		for (String name : names) {
			concatenatedNames += name + " "; 
		}
		System.out.println(concatenatedNames.trim()); //Trim to remove trailing space
		
		// 3. Access the last element of an array
		int[] numbers = {10, 20, 30, 40, 50};
		int lastElement = numbers[numbers.length - 1];  
		System.out.println(lastElement);
		
		//4. Access the first element of an array
		int[] numbers2 = {10, 20, 30, 40, 50};
		int firstElement = numbers2[0];  
		System.out.println(firstElement);
		
		//5. New array to store the lengths of each name
		int[] nameLengths = new int[names.length];
		//6. Iterate over the names array and add the length of each name to nameLengths
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length(); //Store the length of each name
		}
		
		System.out.println("Name lengths: ");
		for (int length : nameLengths) {
			System.out.println(length + " "); //Print each length
		}
		
		//Loop to iterate over the nameLengths array
		for (int length : nameLengths) {
			sum += length;
		}
		System.out.println(sum);
		

	}
	//7. Method to take a word and and int as arguments and concatenates itself 3 times
	public static String concatenateWord(String word, int n) {
        StringBuilder concatenatedWord = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            concatenatedWord.append(word);  // Append the word n times
        }
        
        return concatenatedWord.toString();  // Convert StringBuilder to String and return
    }
	
	//8. Method that takes firstName and lastName and returns a full name
	public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;  
    }
	
	//9. Method that checks if the sum of array elements is greater than 100
    public static boolean isSumGreaterThan100(int[] numbers) {
        int sum1 = 0;
        
        for (int number : numbers) { 
            sum1 += number;
        }
               
        return sum1 > 100; // Return true if the sum is greater than 100
    }
    
    //10. Method that returns the average of all elements in the array
    public static double getAverage(double[] numbers) {
        double sum2 = 0;
        
        for (double number : numbers) {
            sum2 += number;
        }
        
        // Return the average 
        return sum2 / numbers.length;
    }
    
    //11. method that takes two arrays of double
    public static boolean isFirstArrayAverageGreater(double[] array1, double[] array2) {
        // Calculate the average of array1
        double sum1 = 0;
        for (double num : array1) {
            sum1 += num;
        }
        double average1 = sum1 / array1.length;

        // Calculate the average of array2
        double sum2 = 0;
        for (double num : array2) {
            sum2 += num;
        }
        double average2 = sum2 / array2.length;

        // Return true if the average of array1 is greater than array2
        return average1 > average2;
    }
    
    
    //12.
    public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
    	return isHotOutside && moneyInPocket > 10.50;
    }
    
    
    /** 13.
     * This method checks if a person is eligible to vote based on their age.
     * 
     */
    public static boolean isEligibleToVote(int age) {
        return age >= 18;  // Return true if the person is 18 or older
    }
    
}

