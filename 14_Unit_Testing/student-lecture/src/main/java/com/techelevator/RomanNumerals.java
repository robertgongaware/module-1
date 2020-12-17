package com.techelevator;

public class RomanNumerals {
	
	private String value;
	
	public RomanNumerals(String value) {
		this.value = value;
		
	}

	
	public String getValue() {
		return value;
	}
	
	public int toInt() {
		switch(value) { //in the case that it equals...
			case "I":
				return 1;
			case "II":
				return 2;
			case "V":
				return 5;
			case "X":
				return 10;
			default: //if all else fails, do this
				return 0;
			
		}
	}
	
}
