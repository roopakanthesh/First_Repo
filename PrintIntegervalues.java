package demo.array.com;

import java.util.Scanner;

public class PrintIntegervalues {
	public static void main(String[] args) {
	//create an integer array of size 4
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter the size of array");
	    int size = scan.nextInt();
		
		int a[] = new int[size];
		System.out.println(a.length+" is the size of an array");
	    
		//read elements into the array
		System.out.println("User! please enter 4 integer elements of array");
		for(int i = 0;i <= a.length-1; i++) {
			a[i] = scan.nextInt();
		}
		
		//write elements from the array
		System.out.println("The 4 integer elements of an array are:");
	    for(int i=0;i<=a.length-1;i++) {
	    	System.out.println(a[i]);
	    }
		}
	}
