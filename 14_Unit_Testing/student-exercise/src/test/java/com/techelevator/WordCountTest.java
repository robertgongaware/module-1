package com.techelevator;

import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordCountTest {
	
private WordCount counter;


	
	@Before
	public void helper() {
		counter = new WordCount();
	}
	
	@Test
	public void sheep() {
		String[] input = {"ba", "ba", "black", "sheep"};
		Map<String, Integer> output = counter.getCount(input);
		Assert.assertEquals(input, output);
	}
	
	@Test
	public void a_b_c() {
		String[] input = {"a", "b", "a", "c", "b"};
		Map<String, Integer> output = counter.getCount(input);
		Assert.assertEquals(input, output);
	}
	
	@Test
	public void c_b_a() {
		String[] input = {"c", "b", "a"};
		Map<String, Integer> output = counter.getCount(input);
		Assert.assertEquals(input, output);
	}
	
	@Test
	public void empty() {
		String[] input = {};
		Map<String, Integer> output = counter.getCount(input);
		Assert.assertEquals(input, output);
	}
	
	@Test
	public void is_null() {
		String[] input = null;
		Map<String, Integer> output = counter.getCount(input);
		Assert.assertNull(null, output);
	}

}
