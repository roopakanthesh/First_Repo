package demo.array.com;

import java.util.Scanner;

public class Copy2darrayelements {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//size of an array
		System.out.println("User! please enter the size of an array");
		 int size = scan.nextInt();
		
		//creation of an array
		 int a[][] = new int[size][size];
		 int b[][] = new int[size][size];
		 
		 //read the elements
		 System.out.println("User! please enter the elements of an array");
		 for(int i=0;i<=a.length-1;i++) {
			 for(int j=0;j<=a.length-1;j++) {
				 a[i][j] = scan.nextInt();

			 }
		 }
		
		
		 //write the elements
		 System.out.println("Copy elements are : ");
		 for(int i=0;i<=a.length-1;i++) {
			 for(int j=0;j<=a.length-1;j++) {
				 b[i][j] = a[i][j];
			 }
		 }
		 for(int i=0;i<=a.length-1;i++) {
			 for(int j=0;j<=a.length-1;j++) {
				 System.out.print(b[i][j]+" ");

		 }
		 }

	}
}