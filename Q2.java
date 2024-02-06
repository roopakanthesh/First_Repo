package com.kodnest.w3resource;

import java.util.Scanner;

public class Q2 {
	/*2. Write a Java program to print the sum of two numbers.
Test Data: 74 + 36
Expected Output :110*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("user enter number-1");
		int a = scan.nextInt();
		System.out.println("user enter number-2");
		int b = scan.nextInt();
		System.out.println("The sum of to number is "+(a+b));
	}

}
