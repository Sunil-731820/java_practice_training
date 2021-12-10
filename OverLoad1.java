package com.java.demo;

public class OverLoad1 {
	public void show(int x) {
		System.out.println("Show Method with respect to Integers   " + x);
	}
	
	public void show(double x) {
		System.out.println("show methods with respect to Double   " + x);
	}
	
	public void show(String x) {
		System.out.println("Show methods are with respect to String class    " + x);
	}
	public static void main(String[] args) {
		OverLoad1 obj = new OverLoad1();
		obj.show(12);
		obj.show(12.8);
		obj.show("sunil");
	}

}
