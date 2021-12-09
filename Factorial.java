package com.java.demo;

public class Factorial {
	public void Fact(int number) {
		int i =1 ;
		int fact = 1;
		while(i<=number) {
			fact = fact*i;
			i = i+1;
		}
		System.out.println("the factorial of of the given number is"+ fact);
	}
	public static void main(String args[]) {
		int number = 7;
		Factorial obj = new Factorial();
		obj.Fact(number);
	}

}
