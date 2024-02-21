package com.kodnest.strings;

import java.util.Scanner;

public class MultiplicationTableForaGivenNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter the number");
		int n = scan.nextInt();
		multiplication(n);
		scan.close();
	}
	  public static void multiplication(int n) {
		  for(int i=1;i<=10;i++) {
			  System.out.println(n + " x "+i+ " = "+(i*n));
		  }
	}
}
