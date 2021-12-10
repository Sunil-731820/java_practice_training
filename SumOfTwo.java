package com.java.demo;

public class SumOfTwo {
	public void sum(int a , int b) {
		int sum  = a+b;
		System.out.println("the sum of the two number is " + sum);
	}
	public static void main(String[] args) {
		int a=10 , b=10;
		SumOfTwo obj = new SumOfTwo();
		obj.sum(a, b);
	}

}

