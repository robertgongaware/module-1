package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AnimalGroupNameTest {
	
	private AnimalGroupName a;
	
	@Before
	public void new_object_please() {
		a = new AnimalGroupName();
	}
	
	@Test
	public void giraffe_is_Tower() {
		// *  GetHerd("giraffe") → "Tower"
		// Arrange
		String input = "giraffe";
		String output = a.getHerd(input);// Act
		Assert.assertEquals("Tower", output);// Assert
	}
	
	@Test
	public void walrus_is_unknown() {
		//  * GetHerd("walrus") -> "unknown"
		// Arrange
		String input = "walrus";
		String output = a.getHerd(input);// Act
		Assert.assertEquals("unknown", output);// Assert
	}
	
	@Test
	public void Rhino_is_Crash() {
		// * GetHerd("Rhino") -> "Crash"
		// Arrange
		String input = "Rhino";
		String output = a.getHerd(input);// Act
		Assert.assertEquals("Crash", output);// Assert
	}
	
	@Test
	public void rhino_is_Crash() {
		// * GetHerd("rhino") -> "Crash"
		// Arrange
		String input = "rhino";
		String output = a.getHerd(input);// Act
		Assert.assertEquals("Crash", output);// Assert
	}
	
	@Test
	public void elephants_is_unknown() {
		// * GetHerd("elephants") -> "unknown"
		// Arrange
		String input = "elephants";
		String output = a.getHerd(input);// Act
		Assert.assertEquals("unknown", output);// Assert
	}
	
	@Test
	public void empty_is_unknown() {
		// * GetHerd("") -> "unknown"
		// Arrange
		String input = "";
		String output = a.getHerd(input);// Act
		Assert.assertEquals("unknown", output);// Assert
	}
	
	
	

}
