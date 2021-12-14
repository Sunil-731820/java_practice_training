package com.java.generic1;
import java.util.*;
class Data <T> {
	public void swap(T a, T b) {
		T t;
		t = a;
		a = b;
		b = t;
		System.out.println("after swapping of the two number is " + a + " "+ b);
	}
}
public class GenSwapNum { 
	public static void main(String[] args) {
		int a = 12, b = 5;
		Data obj = new Data();
		obj.swap(a,b);
		String s1 = "sunil", s2 = "harish";
		obj.swap(s1, s2);
		double a1 = 90.90,b1 = 100.1;
		obj.swap(a1, b1);
		
		
	}
}
