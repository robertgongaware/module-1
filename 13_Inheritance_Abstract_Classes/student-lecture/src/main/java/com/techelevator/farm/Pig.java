package com.techelevator.farm;

import java.math.BigDecimal;

public class Pig extends FarmAnimal implements Sellable {
    private BigDecimal price;

    public Pig() {
        super("Pig", "oink!");
        price = new BigDecimal("300.00");
    }
    
    public void eat() {
    	System.out.println("Pig ate slop");
    }

    public BigDecimal getPrice() {
        return price;
    }
}