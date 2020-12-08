package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Exercises {

	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 *
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "herd".
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * animalGroupName("Rhino") -> "Crash"
	 * animalGroupName("rhino") -> "Crash"
	 * animalGroupName("elephants") -> "unknown"
	 *
	 */
	public String animalGroupName(String animalName) { //string to string
		Map<String, String> animalGroup = new HashMap<String, String>();
		
		animalGroup.put("rhino", "Crash");
		animalGroup.put("giraffe", "Tower");
		animalGroup.put("elephant", "Herd");
		animalGroup.put("lion", "Pride");
		animalGroup.put("crow", "Murder");
		animalGroup.put("pigeon", "Kit");
		animalGroup.put("flamingo", "Pat");
		animalGroup.put("deer", "Herd");
		animalGroup.put("dog", "Pack");
		animalGroup.put("crocodile", "Float");
		
		if(animalName == null) {//have to account for null. if null, return right away. if you get a null pointer exception, add this code to account for null
			return "unknown";
		}
		
		String group = animalGroup.get(animalName.toLowerCase());//return the animal name stored in group
			if(group == null) {
				group = "unknown";
			}
		 return group;
		
	}

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 *
	 * If the item number is empty or null, return 0.00.
	 *
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 *
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00
	 *
	 */
	public double isItOnSale(String itemNumber) {
		Map<String, Double> discountPrices = new HashMap<String, Double>(); //declare a map that uses key->string, value->double
		discountPrices.put("kitchen4001", 0.20);
		discountPrices.put("garage1070", 0.15);
		discountPrices.put("livingroom", 0.10);
		discountPrices.put("kitchen6073", 0.40);
		discountPrices.put("bedroom3434", 0.60);
		discountPrices.put("bath0073", 0.15);
		
		if(itemNumber == null) {
			return 0.00;
		}
		Double itsOnSale = discountPrices.get(itemNumber.toLowerCase());
			if(itsOnSale == null) {
				return 0.00;
			}
		return itsOnSale;
	}

	/*
	 * Modify and return the given Map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 *
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 *
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		// map already given  as peterPaul, don't need to create a new one, modifying.
		Integer paul = peterPaul.get("Paul"); // go into peterPaul by creating Integer = peterPaul.get("name") for each
		Integer pete = peterPaul.get("Peter");
		Integer peteHalf = peterPaul.get("Peter");
		// if statement to check values of each key.
		if(pete > 0 && paul < 1000) { // if pete has more, and paul less than 10
				peteHalf = pete / 2; // divide pete in half
				paul = peteHalf + paul; // add to paul
				pete = pete - peteHalf;
				peterPaul.put("Paul", paul);
				peterPaul.put("Peter", pete);
				return peterPaul; 
			} else {
				return peterPaul;
		}
	}
	

	/*
	 * Modify and return the given Map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * peterPaulPartnership({"Peter": 50000, "Paul": 100000}) → {"Peter": 37500, "Paul": 75000, "PeterPaulPartnership": 37500}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		Integer paul = peterPaul.get("Paul");
		Integer pete = peterPaul.get("Peter");
		Integer paulPete = (paul / 4) + (pete / 4);
		if(pete >= 5000 && paul >= 10000) {
			pete = pete - (pete / 4);
			paul = paul - (paul / 4 );
			peterPaul.put("Peter", pete);
			peterPaul.put("Paul", paul);
			peterPaul.put("PeterPaulPartnership", paulPete);
			return peterPaul;
			
		}
		
		return peterPaul;
	}

	/*
	 * Given an array of non-empty Strings, return a Map<String, String> where for every different String in the array,
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		Map<String, String> letsDoThis = new HashMap<String, String>();
		
			for(String output : words) { //create a for loop
				String first = output.substring(0, 1); //create string var = substring(0,1);
				String last = output.substring(output.length() -1); //create string var = first 
				letsDoThis.put(first, last);
			} 
		return letsDoThis;
	}

	/*
	 * Given an array of Strings, return a Map<String, Integer> with a key for each different String, with the value the
	 * number of times that String appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */
	public Map<String, Integer> wordCount(String[] words) {// an array of string called words
		Map<String, Integer> fiftyPercent = new HashMap<String, Integer>();// create a map with keys for each string
		for(String word : words) {
			if(!fiftyPercent.containsKey(word)) { //if my new string does
				fiftyPercent.put(word,1);
			} else {
				int wordCount = fiftyPercent.get(word);
				fiftyPercent.put(word, wordCount + 1);
			}
			
		}
		
		return fiftyPercent;
	}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the the classic wordCount **
	 *
	 * intCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 2, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * intCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * intCount([]) → {}
	 *
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		
		Map<Integer, Integer> takeABreak = new HashMap<Integer, Integer>();// create a map with keys for each string
		for(Integer num : ints) {
			if(!takeABreak.containsKey(num)) { //if my new string does
				takeABreak.put(num, 1);
			} else {
				int numCount = takeABreak.get(num);
				takeABreak.put(num, numCount + 1);
			}
			
		}
		
		return takeABreak;
		
	}

	/*
	 * Given an array of Strings, return a Map<String, Boolean> where each different String is a key and value
	 * is true only if that String appears 2 or more times in the array.
	 *
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		Map<String, Boolean> multiple = new HashMap<String, Boolean>();
			for(String word: words) {
				if(!multiple.containsKey(word)) {
					multiple.put(word, false);
				}
				else {
					multiple.put(word, true);
				}
			}
			return multiple;
		}
		
	
	
	
	

	/*
	 * Given two Maps, Map<String, Integer>, merge the two into a new Map, Map<String, Integer> where keys in Map2,
	 * and their int values, are added to the int values of matching keys in Map1. Return the new Map.
	 *
	 * Unmatched keys and their int values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse,
			Map<String, Integer> remoteWarehouse) {
		
		for(String sku : remoteWarehouse.keySet()) { 
			int value = remoteWarehouse.get(sku);
			if (mainWarehouse.containsKey(sku)) {
				mainWarehouse.put(sku, mainWarehouse.get(sku) + value);
			} else { mainWarehouse.put(sku, value);
			}
		}	
		return mainWarehouse;
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of Strings, for each String, the count of the number of times that a subString length 2 appears
	 * in the String and also as the last 2 chars of the String, so "hixxxhi" yields 1.
	 *
	 * We don't count the end subString, but the subString may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end subString, which we don't count.
	 *
	 * Return Map<String, Integer>, where the key is String from the array, and its last2 count.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */
	public Map<String, Integer> last2Revisited(String[] words) { //pulled code from the exercise final answers thankfully
		Map<String, Integer> iSkippedLast2 = new HashMap<>();
		for(String name : words) {
		
		int count = 0;
		for (int i = 0; i <= name.length() - 3; i++) {
			if (name.substring(i, i + 2).equals(name.substring(name.length() - 2, name.length()))) {
				count++;
			}
		}
		iSkippedLast2.put(name, count);
		
	}
		return iSkippedLast2;
	}

}
