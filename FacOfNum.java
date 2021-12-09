package com.java.demo;

public class FacOfNum {
	public void FactNum(int num) {
		int i=1;
		while(i<=num) {
			if(num%i==0) {
				System.out.println(i);
			}
			i+=1;
		}
	}
	public static void main(String args[]) {
		int num = 12;
		FacOfNum obj = new FacOfNum();
		obj.FactNum(num);
	}

}
