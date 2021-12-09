package com.java.demo;

public class EvenOdd {
	public void num(int number) {
		if(number%2==0) {
			System.out.println("The Given Number is Even ");
		}
		else {
			System.out.println("The Given Number is Odd");
		}
	}
	public static void main(String args[]) {
		int number = 190;
		EvenOdd obj = new EvenOdd();
		obj.num(number);
	}

}
