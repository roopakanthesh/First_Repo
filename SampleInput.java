package demo.array3.com;

import java.util.Scanner;

public class SampleInput {
	/* sample input-1 : 2,3,4,5,6
	  sample output-2 : 5,6,2,3,4
	  
	  sample input-1 : 10,20,50,40,30
	  sample output-2 : 50,40,30,10,20
	   */
	
	public static void main(String[] args) {
		System.out.println("User! please enter the size of an array");
		Scanner scan = new Scanner(System.in);
		 int size = scan.nextInt();
		 

		//array creation
		int a[] = new int[size];
	    int b[] = new int[size];
	    
	    System.out.println("Rotating values are");
	    int k = scan.nextInt();

		 // write the elements
	 System.out.println("User! please enter the elements of an array ");
	 for(int i=0;i<=a.length-1;i++) {
		 a[i] = scan.nextInt();
	 }
	 
	 //display the elements
	 System.out.println("The rotated array is : ");
	 for(int i=0;i<=a.length-1;i++) {
	     int j = (i+k)%size;
	     b[j]=a[i];
	 }
	
	 for(int j=0;j<=a.length-1;j++) {
		 System.out.println(b[j]+" ");
		 
		 
	 }
	}
}
	
