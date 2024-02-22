package com.kodnest.Demoexception;

public class NumberFormatException {
	public static void main(String[] args) {
		String s = "123a";
		int parseInt = Integer.parseInt(s);
		System.out.println(parseInt);
	}

}
