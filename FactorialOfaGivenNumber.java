package com.kodnest.strings;

import java.util.Scanner;

public class FactorialOfaGivenNumber {
     public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter the number");
		int n = scan.nextInt();
		int result = factorial(n);
		System.out.println(result);
     }
     public static int factorial(int n) {
    	 int prod=1;
    	 for(int i=1;i<=n;i++) {
    		 prod=prod*i;
    	 }
    	 return prod;
    	 
     }
}
    	 
