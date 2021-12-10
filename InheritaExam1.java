package com.java.inheri;
class First{
	public void show() {
		System.out.println("Show Methods called from First class okay ");
	}
}

class Second extends First{
	public void display() {
		System.out.println("Display Methods is called from Second class okay ...");
	}
}
public class InheritaExam1 {
	public static void main(String[] args) {
		Second obj = new Second();
		obj.show();
		obj.display();
	}

}
