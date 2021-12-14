package com.java.listInterface1;
import java.util.*;
public class SortEmploy {
	public static void main(String[] args) {
		Comparator c = new NameComparator();
		SortedSet employes = new TreeSet();
		employes.add(new Employ(8,"sunil", 1110));
		employes.add(new Employ(7,"arti", 1110));
		employes.add(new Employ(5,"harish", 1110));
		employes.add(new Employ(2,"suhal", 1110));
		employes.add(new Employ(80,"suman", 1110));
		employes.add(new Employ(81,"subham", 1110));
		for (Object obj : employes) {
			System.out.println(obj);
		}
	}

}
