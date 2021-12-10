package com.java.inheri;

class First{
	public void show() {
		System.out.println("show methods is called out from the First Class ..");
	}
}
class Second extends First{
	public void show() {
//		super.show();
		System.out.println("Show method is called out from the Second Class ...");
	}
}
public class InhSupExam1 {
	public static void main(String[] args) {
		Second obj = new Second();
		obj.show();
	}

}
