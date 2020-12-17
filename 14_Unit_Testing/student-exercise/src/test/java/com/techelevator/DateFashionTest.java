package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateFashionTest {
	
	private DateFashion table;
	
	@Before
	public void counter() {
		table = new DateFashion();
	}

	@Test
	public void no_table_for_you() {
		int input = 0;
		int output = table.getATable(input, 0); 
		Assert.assertEquals(0, output);
	}
	
	@Test
	public void maybe() {
		int input = 5;
		int output = table.getATable(input, 5); 
		Assert.assertEquals(1, output);
	}
	
	@Test
	public void looking_good() {
		int input = 8;
		int output = table.getATable(input, 10); 
		Assert.assertEquals(2, output);
	}
	
}
