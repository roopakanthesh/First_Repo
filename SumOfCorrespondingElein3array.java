package demo.array3.com;

import java.util.Scanner;

public class SumOfCorrespondingElein3array {
       public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//size of array
		System.out.println("User! please enter the size of an  array");
		int x = scan.nextInt();
				
		//array creation
		int a[] = new int[x];
		int b[] = new int[x];
		int c[] = new int[x];
		
		// read the elements
		System.out.println("User! please enter the elements of an 1-array");
		for(int i=0;i<=a.length-1;i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("User! please enter the elements of an 2-array");
		for(int i=0;i<=a.length-1;i++) {
			b[i] = scan.nextInt();
		}
		
		//sum of the elements
		System.out.println("Sum of 2 array elements are: ");
		for(int i=0;i<=a.length-1;i++) {
		c[i]=a[i]+b[i];
		System.out.print(c[i]+" ");
       }
}
}