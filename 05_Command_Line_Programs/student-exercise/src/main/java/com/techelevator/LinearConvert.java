package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner conversion = new Scanner(System.in);
		System.out.print("Please enter the length: ");
		int userTyped = conversion.nextInt();
		Scanner tempScale = new Scanner(System.in);
		System.out.print("Is the measurement in (m)eter, or (f)eet? ");
		String mOrF = "";
				mOrF = tempScale.nextLine();
				double fToM = (userTyped * 3.2808399);
				double mToF = (userTyped * 0.3048);
		if(mOrF.equals("f")) {
			System.out.print(userTyped + "f" + " is " + mToF + "m");
		} else if(mOrF.equals("m")) {
			System.out.print(userTyped + "m" + " is " + fToM + "f");
		} 	
	}
}

	


