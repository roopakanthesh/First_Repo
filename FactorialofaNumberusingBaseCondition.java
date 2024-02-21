package com.kodnest.strings;

import java.util.Scanner;

public class FactorialofaNumberusingBaseCondition {
     Scanner scan = new Scanner(System.in); 
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		else
		{
			return n * factorial(n-1);
		}
		}
	
	public static void main(String[] args) {
		// Replace this with the number for which you want to calculate the factorial
		int number = 3;
		int result = factorial(number);
		System.out.println("The factorial of " + number + " is " + result);
	}
	}