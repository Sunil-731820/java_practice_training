package com.java.listInterface1;
import java.util.ArrayList;
import java.util.List;
public class ListDemo {
	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Sunil");
		names.add("Harish");
		names.add("Arti");
		names.add("subham");
		for (Object obj : names) {
			System.out.println(obj);
		}
		System.out.println("---------------------------------------");
		names.add("suman");
		names.add("khushboo");
		System.out.println("after adding the names into the list ...");
		for (Object obj : names) {
			System.out.println(obj);
		}
		System.out.println("--------------------------------------------");
		System.out.println("after adding the objects at the index of list ------");
		names.add(3,"danish");
		for (Object obj : names) {
			System.out.println(obj);
		}
		names.remove("Sunil");
		System.out.println("after removing the objects from the list okay ....");
		System.out.println("the new list of the array is --------------");
		for (Object obj : names) {
			System.out.println(obj);
		}
		System.out.println("after the removal of the objects from the third positions-----");
		names.remove(2);
		for (Object obj : names) {
			System.out.println(obj);
		}
		System.out.println("after the removal of the values from the list is ....");
	}

}
