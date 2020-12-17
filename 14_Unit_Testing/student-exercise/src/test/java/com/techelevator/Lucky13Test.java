package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Lucky13Test {
	
private Lucky13 newVegas;
	
	@Before
	public void helper() {
		newVegas = new Lucky13();
	}

	@Test
	public void the_courier() {
		int[] input = {0, 2, 4};
		boolean output = newVegas.getLucky(input); 
		Assert.assertTrue("True", output);
	}
	
	@Test
	public void vault_13() {
		int[] input = {1, 2, 3};
		boolean output = newVegas.getLucky(input); 
		Assert.assertFalse("False", output);

	}	
	
	@Test
	public void victor() {
		int[] input = {1, 2, 4};
		boolean output = newVegas.getLucky(input); 
		Assert.assertFalse("False", output);

	}
}
