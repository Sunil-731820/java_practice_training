package com.java.listInterface1;
import java.util.*;
public class LinkHashExam {
	public static void main(String[] args) {
		Set names = new LinkedHashSet();
		names.add("sunil");
		names.add("harish");
		names.add("arti");
		names.add("subham");
		names.add("sunil");
		names.add("harish");
		names.add("arti");
		names.add("subham");
		names.add("sunil");
		names.add("harish");
		names.add("arti");
		names.add("subham");
		names.add("sunil");
		names.add("harish");
		names.add("arti");
		names.add("subham");
		for (Object obj : names) {
			System.out.println(obj);
		}
	}	

}
