package com.java.demo;

public class Employ {
	int empno;
	String name ;
	double basic ;
	public Employ() {
		this.empno = 5;
		this.name = "Sunil";
		this.basic = 12111;
	}


	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
	

}
