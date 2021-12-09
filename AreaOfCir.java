package com.java.demo;

public class AreaOfCir {
	public void area(int radius) {
		double area1 = 3.14*radius*radius;
		System.out.println("the area of the cicle is"+ area1);
	}
	public void peri(int radius) {
		double perimeter = 2*3.14*radius;
		System.out.println("the perimeter is " + perimeter);
	}
	public static void main(String args[]) {
		AreaOfCir obj = new AreaOfCir();
		obj.area(7);
		obj.peri(7);
	}

}
