package com.java.static1;

public class StaticCons {
	static {
		System.out.println("this is Static constructor called out okay ....");
	}
	StaticCons(){
		System.out.println("this is General Constructor called out okay ....");
	}
	public static void main(String[] args) {
		StaticCons obj = new StaticCons();
	}

}
