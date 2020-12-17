package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class CigarPartyTest {
	
	private CigarParty squirrelsAreTheWorst;
	
	
	@Before
	public void counter() {
		squirrelsAreTheWorst = new CigarParty();
	}
	
	@Test
	public void test_base_values() {
		int input = 40;
		boolean isTrue = true;
		boolean output = squirrelsAreTheWorst.haveParty(input, isTrue); 
		Assert.assertTrue("True", output);	
	}								
		
	@Test
	public void test_30_false() {
		int input = 30;
		boolean isTrue = false;
		boolean output = squirrelsAreTheWorst.haveParty(input, isTrue); 
		Assert.assertFalse("False", output);	
	}	
	
	@Test
	public void test_50_false() {
		int input = 50;
		boolean isTrue = false;
		boolean output = squirrelsAreTheWorst.haveParty(input, isTrue); 
		Assert.assertFalse("False", output);	
	}
	
	@Test
	public void test_70_true() {
		int input = 70;
		boolean isTrue = true;
		boolean output = squirrelsAreTheWorst.haveParty(input, isTrue); 
		Assert.assertTrue("True", output);	
	}
		
		
	}
	


