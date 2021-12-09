package com.java.demo;

public class CentToFahren {
	public void fahren(int cen) {
		double answer = ((9*cen)/5+32);
		System.out.println("the answer is " + answer);
	}
	public static void main(String args[]) {
		int cen = 37;
		CentToFahren obj = new CentToFahren();
		obj.fahren(cen);
	}

}
