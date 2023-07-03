package com.kh.day06.oop.objectarray;

public class Circle {
	int radius;
	
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	// return이 없으려면 void로 선언
	public double getArea() {
		double area = 3.14 * radius * radius;
		return area;
	}
}
