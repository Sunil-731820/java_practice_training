package com.java.demo;

public class BoxRun {
	public void show(Object ob) {
		String type = ob.getClass().getSimpleName();
		if(type.equals("Integer")) {
			System.out.println("It is belonging to the Integer class ");
			int x = (Integer)ob;
			System.out.println("the value of the X is : -> " + x);
		}
		if(type.equals("Double")) {
			System.out.println("It is Belonging to the Double class ");
			double x = (Double)ob;
			System.out.println("the value of the x is in double is "  + x);
		}
		if(type.equals("String")) {
			System.out.println("It is Belonging to the string class  ");
			String x = (String)ob;
			System.out.println("the String is  " + x);
		}
//		System.out.println("the type is " + type);
	}
	public static void main(String[] args) {
		int a = 12;
		double b = 12.5;
		String name = "Sunil";
		BoxRun obj = new BoxRun();
		obj.show(a);
		obj.show(b);
		obj.show(name);
	}

}
