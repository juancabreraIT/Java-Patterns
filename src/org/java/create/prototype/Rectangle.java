package org.java.create.prototype;

public class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("Inside Rectangle::draw()");
	}
	
	public Rectangle() {
		type = "Rectangle";		
	}

}
