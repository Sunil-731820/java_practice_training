package com.java.demo;

public class PosToNeg {
	public void Number(int num) {
		if(num>0) {
			System.out.println("the Given number is Positive");
		}
		else {
			System.out.println("the Given numbre is Negative");
		}
	}
	public static void main(String args[]) {
		int num = 90;
		PosToNeg obj = new PosToNeg();
		obj.Number(num);
	}

}
