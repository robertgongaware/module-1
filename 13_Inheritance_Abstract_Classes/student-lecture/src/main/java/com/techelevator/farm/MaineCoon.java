package com.techelevator.farm;

import java.math.BigDecimal;

public class MaineCoon extends Cat { // final class must provide code from any inherited methods/traits from the "contract" that any parent or grandparent inherited.

	public MaineCoon() {
		super();
	}
	
	public BigDecimal getPrice() {
		return new BigDecimal("100.00");
	}
	
	
	public void eat() {
		System.out.println("Mmmm, Fancy Feast!");
	}
	

}
