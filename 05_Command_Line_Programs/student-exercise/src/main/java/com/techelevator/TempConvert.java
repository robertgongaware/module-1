package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner temperature = new Scanner(System.in);
		System.out.print("Please enter the temperature: ");
		int userTyped = temperature.nextInt();
		Scanner tempScale = new Scanner(System.in);
		System.out.print("Is the temperature in (C)elcius, or (F)ahrenheit? ");
		String cOrF = "";
				cOrF = tempScale.nextLine();
				double fToC = ((userTyped * 1.8) + 32);
				double cToF = ((userTyped -32) / 1.8);
		if(cOrF.equals("F")) {
			System.out.print(userTyped + "F" + " is " + (int)cToF + "C");
		} else if(cOrF.equals("C")) {
			System.out.print(userTyped + "C" + " is " + (int)fToC + "F");
		} 	
	}
}
		
		
		
		
		
		
			
	
	
	




// need to use .equals