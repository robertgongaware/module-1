package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SameFirstLastTest {
	
private SameFirstLast match;
	
	@Before
	public void helper() {
		match = new SameFirstLast();
	}

	@Test
	public void test_1_2_3_false() {
		int[] input = {1, 2, 3};
		boolean output = match.isItTheSame(input); 
		Assert.assertFalse(output);
	}
	
	@Test
	public void test_1_2_3_1_true() {
		int[] input = {1, 2, 3, 1};
		boolean output = match.isItTheSame(input); 
		Assert.assertTrue(output);
	}
	
	@Test
	public void test_1_2_1_true() {
		int[] input = {1, 2, 1};
		boolean output = match.isItTheSame(input); 
		Assert.assertTrue(output);
	}
	
	@Test
	public void test_null() {
		int[] input = null;
		boolean output = match.isItTheSame(input); 
		Assert.assertFalse(output);
	}
	
	@Test
	public void empty() {
		int[] input = {};
		boolean output = match.isItTheSame(input); 
		Assert.assertFalse(output);
	}

}
