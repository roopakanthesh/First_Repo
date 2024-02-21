package com.kodnest.Static;

class Citizen{
	static {
		System.out.println("block-1");
	}
	
	 {
		System.out.println("block-2");
	}
}
	//static int Nationality;
	//int age;


    /* void display1() {
    	 System.out.println("Instance method");
     }
    	 
     
     void display2() {
    	 System.out.println("Static method");
     }
     }
     
     */

public class Solution {
	public static void main(String[] args) {
		System.out.println("main method");
	 Citizen citizen = new Citizen();
	}
}

	  // citizen.display1();
		// citizen.display2();
		
		//System.out.println(c.age);
		//System.out.println(c.Nationality);
	
	

