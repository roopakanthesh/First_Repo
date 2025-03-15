package com.kodnest.hackerhank;

public class Factorial {
   public static void main(String[] args) {
	int i=5;
	int fact=1;
	while(i>=0) {
		fact=fact*i;
		i=i-1;
		System.out.println(fact);
	}
}
}
