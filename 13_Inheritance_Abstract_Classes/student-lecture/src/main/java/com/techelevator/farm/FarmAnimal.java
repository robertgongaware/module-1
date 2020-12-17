package com.techelevator.farm;

public abstract class FarmAnimal implements Singable { // if you make this Final, nothing can inherit from this class
	// use abstract only exist for polymorphism and inheritance. use to leverage those principles. abstrct cannot be instantiated
	private String name;
	private String sound;

	public FarmAnimal(String name, String sound) { //abstract does not need/use a constructor, but need one for any child class so they can use
		this.name = name;
		this.sound = sound;
	}
	
	public abstract void eat(); //inside an abstract class, you can provide an abstract method. makes it inheritable, but the child MUST provide the code block.

	public String getName( ) { // if you inherit from a 
		return name;
	}
	public final String getSound( ) { // whoever inherits, may NOT override
		return sound;
	}

}