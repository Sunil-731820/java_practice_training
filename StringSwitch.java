package com.java.demo;

public class StringSwitch {
	public void example(String dayname) {
		switch(dayname ) {
		case "Monday":
			System.out.println("Today is Monday");
			break;
		case "Tuesday":
			System.out.println("Today is Tuesday");
			break;
		case "Wednesday":
			System.out.println("Today is Wednesday");
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
	}
	public static void main(String args[]) {
		String dayname = "Thursday";
		StringSwitch obj = new StringSwitch();
		obj.example(dayname);
	}
}
