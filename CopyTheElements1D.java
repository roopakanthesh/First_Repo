package demo.array.com;

import java.util.Scanner;

public class CopyTheElements1D {
	public static void main(String[] args) {
		
		//create an integer array of size 4
		Scanner scan = new Scanner(System.in);
		System.out.println("User! please enter the size of array");
	    int size = scan.nextInt();
		
	    //array creation
		int a[] = new int[size];
		int b[] = new int[size];
		System.out.println(a.length+" is the size of an array");
	    
		//read elements into the array
		System.out.println("User! please enter  integer elements of array");
		for(int i = 0;i <= a.length-1; i++) {
			a[i] = scan.nextInt();
		}
		
		//write elements from the array
		System.out.println("copy the elements are:");
	    for(int i=0;i<=a.length-1;i++) {
	    	b[i]=a[i];
	    }
	    for(int i=0;i<=a.length-1;i++) {
	    	System.out.print(b[i]+" ");
	    }
	    }
	}
