package com.java.demo;

public class SwitchcaseExe {
	public void Example(int number) {
		switch(number) {
		case 1:
			System.out.println("the person Enter the 1 ");
			break;
		case 2:
			System.out.println("The Person Enter the 2 ");
			break;
		case 3:
			System.out.println("The Person Enter the Number 3 ");
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}
	public static void main(String[] args) {
		int number = 12;
		SwitchcaseExe obj = new SwitchcaseExe();
		obj.Example(number);
	}


}
