package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {
	
	@Test
	public void i_returns_one() {
		String input = "I";      //Arrange
		RomanNumerals objectToTest = new RomanNumerals(input);
		
		int output = objectToTest.toInt();    //Act
		
		Assert.assertEquals(1, output);  //Assert
	}
	
	@Test
	public void ii_returns_two() {
		RomanNumerals objectToTest = new RomanNumerals("II");
		int output = objectToTest.toInt();
		Assert.assertEquals(2, output);
	}
	
	@Test
	public void v_returns_five() {
		RomanNumerals objectToTest = new RomanNumerals("V");
		int output = objectToTest.toInt();
		Assert.assertEquals(5, output);
	}
	
	@Test
	public void x_returns_ten() {
		RomanNumerals objectToTest = new RomanNumerals("X");
		int output = objectToTest.toInt();
		Assert.assertEquals(10, output);
	}

}
