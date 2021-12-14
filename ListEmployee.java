package com.java.listInterface1;
import java.util.List;
import java.util.*;
public class ListEmployee {
	public static void main(String[] args) {
		List emploList = new ArrayList();
		emploList.add(new Employ(1,"sunil",99882));
		emploList.add(new Employ(2,"harish",337737));
		emploList.add(new Employ(3,"arti",5353));
		for (Object emp : emploList) {
			System.out.println(emp);
		}
	}

}
