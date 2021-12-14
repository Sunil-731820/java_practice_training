package com.java.generic1;
import java.util.*;
public class GenStringExam {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("sunil");
		names.add("harish");
		names.add("arti");
		names.add("subham");
		names.add("suman");
//		so the below comment sure that it is providing the security to the data okay .....remember .....
//		names.add(12);
		for (String name : names) {
			System.out.println(name);
		}
	}

}
