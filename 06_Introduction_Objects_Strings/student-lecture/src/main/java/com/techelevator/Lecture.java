package com.techelevator;

import java.util.Scanner;

public class Lecture {
	
//	public static void main(String[] args) {
//		
//		System.out.println("Enter [F] for Fahrenheit or [C] for Celcius");
//		Scanner keyboard = new Scanner(System.in);
//		
//		String userTyped = keyboard.nextLine();
//		
//		if(userTyped == "F") {
//			System.out.println("Fahrenheit!"); 
//	} else if (userTyped == "C") {
//		System.out.print("Celcius!");
//	}	else {
//			System.out.println("I dunno");
//			
//	}
//	
//	keyboard.close();
//}
	public static void main(String[] args) {

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */
		String literal = "this is a literal example of just that";
		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		System.out.println(literal.endsWith("hat"));
		System.out.println(literal.indexOf("is")); //give the position of the string of the first occurance of "is"
		//  0123456789
		// "this is an literal example of just that";
		//   012!
		System.out.println(literal.indexOf("is", 3)); //gives the first "is" starting at 3
		//"this is an example of just that";
		// 012345!
		System.out.println(literal.indexOf("JAVA"));
		//will print -1 because JAVA is not in the string
		System.out.println(literal.lastIndexOf("is"));
		//will print out 5 because that's the index of where the last "is" is
		System.out.println(literal.substring(4));
		//substring(1) starts at a point and reads all after
		//starts at index 4 of the string
		//if you input 144, you get an out of bounds exception because that exceeds the boundaries
		System.out.println(literal.substring(5, 10));
		//substring(5, 10) -> starts at a point INCLUSIVE (5), and ends at a point EXCLUSIVE (in this case 9 [excludes 10]), does not include the character it stops at		
		System.out.println(literal.substring(3, literal.length()));
		//literal.length is out of bounds, but is excluded so no error
		System.out.println("    .trim() will   remove  whitespace at the   beginning and at the end     ".trim());
		//removes spaces at the front and back but not the middle
		
		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */

		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();
		

		String hello1 = "From the other side";
		String hello2 = "From the other side";
		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

	}
}
