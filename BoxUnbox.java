package com.java.demo;

public class BoxUnbox {
	public static void main(String[] args) {
		int a = 12;
		double b = 12.5;
		String name = "Sunil";
//		"i am try to boxing the data "
		Object ob1 = a;
		Object ob2 = b;
		Object ob3 = name;
		
//		after boxing i trying to unboxing the data
		int a1 = (Integer)ob1;
		double b1 = (Double)ob2;
		String s1 = (String)ob3;
		System.out.println("the integer parts of the data is " + a1);
		System.out.println("the double parts of the data is " + b1);
		System.out.println("the String parts of the data is " + s1);
	}

}
