package com.java.demo;

public class WhileDemo {
	public void show() {
		int n = 10,i=1;
		while(i<=n) {
			System.out.println(i);
			i +=1;
		}
	}
	public static void main(String args[]) {
		WhileDemo obj = new WhileDemo();
		obj.show();
	}

}
