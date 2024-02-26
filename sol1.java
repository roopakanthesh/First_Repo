package com.kodnest.jfc;

import java.util.Scanner;

public class sol1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string 1");
		String s1 = scan.next();
		System.out.println("enter string 2");
		String s2 = scan.next();
		if(s1.equals(s2)) {
			System.out.println("Strings are equal.");
		}
		else
		{
			System.out.println("Strings are not equal.");
		}
		s1.length();
		
	}

}
