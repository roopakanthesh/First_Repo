package com.kodnest.strings;

public class InFiniteRecursiveFunction {
	public static void main(String[] args) {
		fact();
	}
	
	public static void fact() 
	{
		System.out.println("executing!");
		fact();
	}

}
