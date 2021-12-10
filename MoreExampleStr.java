package com.java.demo;

public class MoreExampleStr {
	public void show() {
		String str = "Welcome to the java training parts";
		System.out.println("the length of the given string is " + str.length());
		System.out.println("the character at the index 7 is " + str.charAt(7));
		System.out.println("the upperCase of the string is :->" + str.toUpperCase());
		System.out.println("the lowerCase of the string is:-> " + str.toLowerCase());
		/* now this is the text for comparing the string by using some functions*/
		String s1 = "Sunil", s2 ="Harish",s3="Sunil";
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));		
	}
	public static void main(String[] args) {
		MoreExampleStr obj = new MoreExampleStr();
		obj.show();
	}

}
