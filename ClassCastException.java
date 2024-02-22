package com.kodnest.Demoexception;

public class ClassCastException {
	public static void main(String[] args) {
		Object o = "Hello Object";
		Integer i = (Integer) o;
		System.out.println(i);
	}

}
