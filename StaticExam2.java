package com.java.static1;

public class StaticExam2 {
//	this is the general methods okay so we have to create the objects of this class
	public void show() {
		System.out.println("this Show methods is called out okay ....");
	}
//	this is the static class so we have to called without creation of the objects 
	public static void display() {
		System.out.println("this static methods is called out okay ...");
	}
	public static void main(String[] args) {
	StaticExam2.display();
	StaticExam2 obj = new StaticExam2();
	obj.show();
	StaticExam2 obj1 = new StaticExam2();
	obj1.display();
	}

}
