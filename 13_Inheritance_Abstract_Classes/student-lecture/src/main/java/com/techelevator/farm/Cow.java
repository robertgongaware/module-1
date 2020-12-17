package com.techelevator.farm;

import java.math.BigDecimal;

public class Cow extends FarmAnimal implements Sellable {
	private BigDecimal price;

	public Cow() {
		super("Cow", "moo!");
		price = new BigDecimal("1500.00");
	}
	
	public void eat() {
		System.out.println("Cow ate grass");
	}

	public BigDecimal getPrice() {
		return price;
	}
}
