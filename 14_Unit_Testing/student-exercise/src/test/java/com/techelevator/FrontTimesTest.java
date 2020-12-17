package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FrontTimesTest {
	
private FrontTimes theFront;
	
	@Before
	public void counter() {
		theFront = new FrontTimes();
	}

	@Test
	public void chocolate() {
		String input = "Chocolate";
		String output = theFront.generateString(input, 2); 
		Assert.assertEquals("ChoCho", output);
	}
	
	@Test
	public void empty_String() {
		String input = "";
		String output = theFront.generateString(input, 0); 
		Assert.assertEquals("", output);
	}
	
	@Test
	public void a_b_c() {
		String input = "Abc";
		String output = theFront.generateString(input, 3); 
		Assert.assertEquals("AbcAbcAbc", output);
	}

}
