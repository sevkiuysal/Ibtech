package com.godoro.circle;

public class Circle {
	
	private int radius;
	
	

	public Circle(int radius) {
		
		this.radius = radius;
	}
	
	public Circle() {
		this(1);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	double getArea() {
		return Math.PI*radius*radius;
	}

	double getPerimeter() {
		return 2 * Math.PI*radius;
	}
	
	

}
