package com.kodnest.Demoexception;

import java.util.Scanner;

public class DemoException {
	public static void main(String[] args) {
		
		System.out.println("Bank app started");
		int oripin = 4444;
		int balance = 20000;
		int pin=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enetr the pin");
		try {
	  pin = scan.nextInt();    //Exception 
	  if(pin==oripin) {
		  System.out.println("Balance is : "+balance);
		}
		}
		
	   catch (Exception e) {
	   System.out.println("user! please enter valid numbers only");
		}
		
		finally {
		System.out.println("Bank app teminated");
		scan.close();
		}
		
	}
}

	
  

