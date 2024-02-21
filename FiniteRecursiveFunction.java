package com.kodnest.strings;

public class FiniteRecursiveFunction {
	public static void main(String[] args) {
		int n = 20;
		fact(n);
	}
		public static void fact(int n) {
			if(n==10){
			return;
			}
			System.out.println("Executing"+n);
			n= n-1;
			fact(n);
					}

}
