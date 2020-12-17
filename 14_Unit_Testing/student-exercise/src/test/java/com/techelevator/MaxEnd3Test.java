package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxEnd3Test {
	
private MaxEnd3 end;
	
	@Before
	public void helper() {
		end = new MaxEnd3();
	}

	@Test
	public void test_1_2_3() {
		int[] input = {1, 2, 3};
		int[] output = end.makeArray(input); 
		Assert.assertArrayEquals(input, output);
	}
	
	@Test
	public void test_11_5_9() {
		int[] input = {11, 5, 9};
		int[] output = end.makeArray(input); 
		Assert.assertArrayEquals(input, output);
	}
	
	@Test
	public void test_2_11_3() {
		int[] input = {2, 11, 3};
		int[] output = end.makeArray(input); 
		Assert.assertArrayEquals(input, output);
	}

}
