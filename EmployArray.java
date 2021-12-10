package com.java.demo;

public class EmployArray {
	public static void main(String[] args) {
		Employ[] arrayEmploy = new Employ[] {
				new Employ(1,"sunil",10000),
				new Employ(2,"harish",12000),
				new Employ(3,"arti",13000),
				new Employ(4,"sachin",14000)
		};
		for (Employ employ : arrayEmploy) {
			System.out.println(employ);
		}
	}

}
