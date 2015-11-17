package org.java.create.prototype;

public class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("Inside Circle::draw()");
	}

	public Circle() {
		type = "Circle";
	}
	
}
