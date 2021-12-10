package com.java.inheri;
class C1 {
	C1(){
		System.out.println("base class is called out okay ...");
	}
}
class C2 extends C1{
	C2(){
		System.out.println("Derived class is called out ookay ...");
	}
}
public class InheritExam2 {
	public static void main(String[] args) {
		C2 obj = new C2();
	}
}
