package com.java.listInterface1;
import java.util.List;
import java.util.ArrayList;
public class ListInt {
	public static void main(String[] args) {
		List number = new ArrayList();
		number.add(12);
		number.add(13);
		number.add(67);
		for (Object num : number) {
			System.out.println(num);
		}
		int sum = 0;
		System.out.println("the sum of the two number is ");
		for (Object num1  : number) {
			sum += (Integer)num1;
		}
		System.out.println("the sum of the list iis " + sum );
		
	}
}
