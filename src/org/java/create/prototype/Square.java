package org.java.create.prototype;

public class Square extends Shape {

	@Override
	void draw() {
		System.out.println("Inside Square::draw()");
	}
	
	public Square() {
		type = "Square";
	}

}
