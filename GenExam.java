package com.java.generic1;
import java.util.*;
public class GenExam {
	public static void main(String[] args) {
		List<Integer> number = new ArrayList<Integer>();
		number.add(new Integer(12));
		number.add(new Integer(14));
		number.add(new Integer(78));
//		so the below comment lines makes the security by using the generics in java okay .... remember ...
//		number.add(new String("sunil"));
		int sum = 0;
		for (Integer num1 : number) {
			sum +=num1;
		}
		System.out.println("the sum of the all element in the list is " + sum );
	}
}
