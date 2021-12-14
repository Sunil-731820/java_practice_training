package com.java.listInterface1;
import java.util.*;
import java.util.SortedSet;
import java.util.TreeSet;
public class SortDemo {
	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("sunil");
		names.add("harish");
		names.add("arti");
		names.add("subham");
		for (Object obj : names) {
			System.out.println(obj);
		}
	}
}
