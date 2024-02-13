package demo.array.com;

import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//size of an  
		System.out.println("User! please enter the size of an array");
		int size = scan.nextInt();
		
		//creation of an array
		int []a = new int[size];
		
		//read the elements 
		System.out.println("User! please enter the array elements");
		for(int i=0;i<=a.length-1;i++) {
			a[i] = scan.nextInt();
		}
		
		//search the element
		System.out.println("User! please enter the search element");
		int find = scan.nextInt();
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]==find) {
				sum = sum+a[i];
			}
		}
		if(sum!=0) {
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
				
			}
			
		}
	}

