package com.kodnest.jfc;

import java.util.Scanner;

public class sol {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String r1=scan.nextLine();
	String r2=scan.nextLine();
	String r3=scan.nextLine();
	int count = 0;
	for(int i=0; i<r3.length(); i++) {
		if(r1==r3.substring(i)) {
			count++;
		}
		if(r2==r3.substring(i)) {
			count++;
		}
	}
	if(count==2) {
		System.out.println("Substring");
	}
	
	else {
		System.out.println("false");
	}
	System.out.println();
	
	scan.close();
}
}

