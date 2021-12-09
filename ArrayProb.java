package com.java.demo;

public class ArrayProb {
	public void show() {
		int[] number = new int[] {1,2,3,4,5,6,7};
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
	}
	public static void main(String args[]) {
		ArrayProb obj = new ArrayProb();
		obj.show();
	}

}
