package com.java.demo;

public class ArrayStr {
	public void show() {
		String[] names = new String[] {
				"ABC",
				"PQR",
				"STR"
		};
		for(int i=0;i<names.length;i++) {
			System.out.println("name of each students is::::>"+names[i]);
		}
	}
	public static void main(String args[]) {
		ArrayStr obj = new ArrayStr();
		obj.show();
	}

}
