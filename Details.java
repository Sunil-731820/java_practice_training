package com.java.demo;

public class Details {
	int empno;
	String name ;
	double basic;
	
	@Override
	public String toString() {
		return "Details [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}

	public static void main(String[] args) {
		Details obj1 = new Details();
		obj1.empno = 1;
		obj1.name = "sunil";
		obj1.basic = 12111;
		System.out.println(obj1);
		
		Details obj2 = new Details();
		obj2.empno = 12;
		obj2.name = "harish";
		obj2.basic = 100000;
		System.out.println(obj2);
	}

}
