package Week04Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DifferentCollections {

	public static void main(String[] args) {
		
		/*
		 *  Lists 
		 *  
		 *  Allows duplicates
		 *  Keeps elements ordered by index
		 *  Allows null values
		 *  Common implementations: ArrayList, LinkedList, Vector
		 */
		
		List<String> students = new ArrayList<String>();
		students.add("Rob");
		students.add("Rob");
		students.add("Sam");
		students.add(null);
		
		for (String student : students) {
			System.out.println(student);
		}
		System.out.println(students.get(2)); //Sam
		System.out.println(students.get(0)); //Rob
		
		/*
		 * Set
		 * No Duplicates
		 * Unordered
		 * Allows null values
		 * Common implementations: HashSet, LinkedHashSet & TreeSet
		 */
		
		Set<String> states = new HashSet<String>();
		states.add("Colorado");
		states.add("Louisiana");
		states.add("Florida");
		states.add("Montana");
		states.add("Wyoming");
		states.add(null);
		
		System.out.println(states.size());
		System.out.println(states.contains("California"));
		
		for (String state : states) {
			System.out.println(state);
			
		}
		
		/*
		 * Map
		 * 
		 * Map<K,V> K is the key and V is the value
		 * Key value pairs (Dictionary)
		 * Values can be duplicates but not keys
		 * Common implementations include HashMap, LinkedHashMap, HashTable & TreeMap
		 */
		
		Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
		racerPlacements.put(1, "Tommy");
		racerPlacements.put(2, "Gabe");
		racerPlacements.put(3, "Leo");
		
		System.out.println(racerPlacements.get(1));
		
		Set<Integer> racerKeys = racerPlacements.keySet();for (Integer key : racerKeys) {
			System.out.println(key + ": " + racerPlacements.get(key));
		}
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Augment", "make (something) greater by adding to it; increase");
		dictionary.put("Diminish", "Make or become less");
		dictionary.put("Ostentatious", "characterized by vulger or prententious display; designed to impress");
		
		
		
	}

}
