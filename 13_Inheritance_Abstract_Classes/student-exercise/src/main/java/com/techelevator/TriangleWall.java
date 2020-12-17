package com.techelevator;

public class TriangleWall extends Wall {
	
	private int base;
	private int height;
	
	public TriangleWall (String name, String color, int base, int height) {
		super(name, color);
		this.base = base;
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public int getHeight() {
		return height;
	}
	
	public int getArea() {
		int triangle = (base * height) / 2;
		return triangle;
	}
	
	public String toString() {
		return getName() + " (" + this.base + "x" + this.height + ") " + "triangle";
	}
	

}
