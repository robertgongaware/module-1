package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringBitsTest {
	
private StringBits theBits;
	
	@Before
	public void helper() {
		theBits = new StringBits();
	}
	
	@Test
	public void hello() {
		String input = "Hello";
		String output = theBits.getBits(input);
		Assert.assertEquals("Hlo", output);
	}
	
	@Test
	public void hi() {
		String input = "Hi";
		String output = theBits.getBits(input);
		Assert.assertEquals("H", output);
	}
	
	@Test
	public void heeololeo() {
		String input = "Heeololeo";
		String output = theBits.getBits(input);
		Assert.assertEquals("Hello", output);
	}
	
	@Test
	public void empty() {
		String input = "";
		String output = theBits.getBits(input);
		Assert.assertEquals("", output);
	}
	
	@Test
	public void is_null() {
		String input = null;
		String output = theBits.getBits(input);
		Assert.assertEquals(null, output);
	}

}
