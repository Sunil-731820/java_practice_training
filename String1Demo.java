package com.java.demo;

public class String1Demo {
	public static void main(String[] args) {
		String s1 = "sunil";
		String s2 = "Harish";
		String s3 = "sunil";
		System.out.println("the address of the s1 is " + s1.hashCode());
		System.out.println("the string s1 is " + s1);
		System.out.println("the address of s2 is " + s2.hashCode());
		System.out.println("the string s2 is " + s2);
		System.out.println("the address of s3 is " + s3.hashCode());
		System.out.println("the string s3 is " + s3);
	}

}
