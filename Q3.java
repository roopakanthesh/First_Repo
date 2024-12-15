package com.kodnest.w3resource;

import java.util.Scanner;

public class Q3 {
	/*3. Write a Java program to divide two numbers and print them on the screen.
Test Data :
50/3
Expected Output :
16*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number-1");
		int a = scan.nextInt();
		System.out.println("enter number-2");
		int b = scan.nextInt();
		System.out.println("The result is "+(a/b));
	}

}
