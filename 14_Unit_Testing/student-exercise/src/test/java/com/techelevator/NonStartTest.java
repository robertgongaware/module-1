package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NonStartTest {
	
private NonStart a;
	
	@Before
	public void helper() {
		a = new NonStart();
	}
	
	@Test
	public void kenobi() {
		String input = "Hello";
		String input2 = "There";
		String output = a.getPartialString(input, input2);
		Assert.assertEquals("ellohere", output);
	}
	
	@Test
	public void coffee_talk() {
		String input = "Java";
		String input2 = "Code";
		String output = a.getPartialString(input, input2);
		Assert.assertEquals("avaode", output);
	}

	@Test
	public void taco_bell() {
		String input = "shotl";
		String input2 = "java";
		String output = a.getPartialString(input, input2);
		Assert.assertEquals("hotlava", output);
	}
	
	@Test
	public void empty_a() {
		String input = "";
		String input2 = "empty";
		String output = a.getPartialString(input, input2);
		Assert.assertEquals("mpty", output);
	}
	
	@Test
	public void empty_b() {
		String input = "empty";
		String input2 = "";
		String output = a.getPartialString(input, input2);
		Assert.assertEquals("mpty", output);
	}



}
