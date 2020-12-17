package com.techelevator.farm;

public abstract class Cat extends FarmAnimal implements Sellable {
	
	
	private boolean isSleeping = true;
	
	public Cat() {
		super("Cat", "Meow"); // Every cat ill be a cat, every cat will meow
	}
	
	// SPECIALIZATIONS
	
	public void wakeUp() { 
		isSleeping = false;
	}
	
	public void goToSleep() {
		isSleeping = true;
	}
	
//	@Override
//	public String getSound() { 
//		if(isSleeping) {
//			return "Zzzz...";
//		}
//		return "Meow!";
//	}
	

}
