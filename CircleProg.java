package com.java.demo;

public class CircleProg {
	public void Area(float radius) {
		double area = 3.14*radius*radius;
		System.out.println("the Area of the circle is : " + area);
	}
	public void Peri(float radius) {
		double perimeter = 2*3.14*radius;
		System.out.println("the Perimter of the Circle is  " + perimeter);
	}
	public static void main(String args[]) {
		float radius = 7f;
		CircleProg obj = new CircleProg();
		obj.Area(radius);
		obj.Peri(radius);
	}

}
