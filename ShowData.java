package com.java.demo;

public class ShowData {
	public void hello1() {
		System.out.println("hello h1");
	}
	public void hello2() {
		System.out.println("hello h2");
	}
	public void hello3() {
		System.out.println("hello h3");
	}
	public static void main(String args[]) {
		ShowData obj = new ShowData();
		obj.hello1();
		obj.hello2();
		obj.hello3();
	}

}
