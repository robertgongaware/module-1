package com.techelevator;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main2(String[] args) { //switch to main to run code underneath

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();
		
		//   key     value                           key     value
//		Map<String, String> zipcodes = new HashMap<String, String>();
//		
//		zipcodes.put("15222", "downtown");
//		zipcodes.put("15201", "Lawrenceville");
//		zipcodes.put("15203", "South Side");
//		zipcodes.put("15232", "Shadyside");
//		zipcodes.put("90210", "Beverly Hills");
//		
//		
//		System.out.println(zipcodes.get("15212")); //pass a key that doesn't exist gives null
//		
//		System.out.println(zipcodes.containsKey("15232"));
		
		Map<Integer, String> zipcodes = new HashMap<Integer, String>();
		
		// HashMap is the fastest                       \
		// LinkedHashMap preserves insertion order       > All follows structure of maps
		// TreeMap sorts keys                           /
		
		zipcodes.put(15222, "Downtown");
		zipcodes.put(15201, "Lawrenceville");
		zipcodes.put(15203, "South Side");
		zipcodes.put(15232, "Shadyside");
		zipcodes.put(90210, "Beverly Hills");
		zipcodes.put(15222, "Cultural District"); //adding a key with a different value OVERWRITES the old value
		
		//System.out.println("BEFORE: " + zipcodes.size());
		//zipcodes.remove(15232); //can remove as well, takes the size down like as in lists
		//System.out.println("After: " + zipcodes.size());
		
		//System.out.println(zipcodes.get(15222)); //Internet is basically just passing maps around
		
		//Show me everything in this map? Use a for/each loop for(
		
		for(Integer key : zipcodes.keySet()) { //for each key (integer in this case) in the set of keys that zipcodes holds....print out the keys then use that key to get the value of the key in the map
		
			//Collections.sort(zipcodes); cannot work
			
			System.out.print("Key: " + key + "\t");
			System.out.println("Value: " + zipcodes.get(key));
		}
		
		// Key Value Pair terminology
		// Map (Java)
		// Dictionary (C# / Microsoft .NET
		// Associative Arrays (Perl) { 'key' : 'value', 'key2' : 'value2' }
		// Hash Table
		
		//#################################################################################
		System.out.println("####################");
		System.out.println("        SETS");
		System.out.println("####################");
		System.out.println();
		
		// Set
		//	 Collection
		//   	(only one type)
		//   Unordered
		// 		Non-linear
		//   UNIQUE VALUES
		//		no duplicates
		
		// type  data    var    inst 
			Set<String> names = new HashSet<String>();
			
			names.add("Tom");
			names.add("Beth");
			names.add("Walt");
			names.add("Ellen");
			names.add("Tom");
			names.add("Marissa");
			names.add("Tom");
			names.add("Jennifer");
			names.add("Tom");
			names.add("Jake");
			names.add("Eric");
			names.add("Justin");
			names.add("Tom"); //if you add multiple instances of the same value, it only returns one
			
			System.out.println("Set size is: " + names.size());
			
			for(String name : names) {
				System.out.println(name + " is an instructor at Tech Elevator Pittsburgh");
			}
			
			System.out.println("Is Walt here? " + names.contains("Walt"));

	}

	public static void main(String[] args) {
			System.out.println(firstRepeatingCharacter("Cobra Kai"));
	}
	
	public static String firstRepeatingCharacter(String input) { //if i pass you a string (input), you give me the first letter you see twice in Cobra Kai
		Set<String> seenThisLetter = new HashSet<String>();
		
		for(int i =0; i < input.length(); i++) {
			String thisLetter = input.substring(i, i + 1);
			
			if(seenThisLetter.contains(thisLetter)) { //if seenthisletter contains this letter, return the letter
				return thisLetter;
			} else { //if not, add the letter and go back through the loop this you have a dupe, if no dupe, return null
				seenThisLetter.add(thisLetter);
			}
//			int sizeBefore = seenThisLetter.size();
//			seenThisLetter.add(thisLetter);//will add one letter at a time to the set
//			int sizeAfter = seenThisLetter.size();
//			
//			if(sizeBefore == sizeAfter) {
//				return thisLetter;
//			}
		} return null;//if there is no repeating char, it returns null
	}
	
	public static int getLastElement(int[] array) { //Big O, O(1) constant
		return array[array.length - 1];
	}
	
	public static int getSum(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];	
		} return sum;
		
	} 
	public static boolean containsDuplicate(int[] array) {
//		for(int i = 0; i < array.length; i++) {
//			int thisElement = array[i];
//			
//			for(int j = 0; j < i; j++) {
//				int previousElement = array[j];
//				
//				if(previousElement == thisElement) {
//					return true;
//				}
//			}
//		} {
	 return false;
	}
}
