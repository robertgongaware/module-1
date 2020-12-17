package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Less20Test {
	
private Less20 less;
	
	@Before
	public void counter() {
		less = new Less20();
	}

	@Test
	public void true_18() {
		int input = 18;
		boolean output = less.isLessThanMultipleOf20(input); 
		Assert.assertTrue("True", output);
	}
	
	@Test
	public void true_19() {
		int input = 19;
		boolean output = less.isLessThanMultipleOf20(input); 
		Assert.assertTrue("True", output);
	}
	
	@Test
	public void false_20() {
		int input = 20;
		boolean output = less.isLessThanMultipleOf20(input); 
		Assert.assertFalse("False", output);
	}

}
