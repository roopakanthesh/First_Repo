package demo.array.com;

import java.util.Scanner;
public class PrintoddElements{
	public static void main(String[] args) {
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
			System.out.println("The odd elements are:");
		    for(int i=0;i<=a.length-1;i++) {
		    	if(a[i]%2==1) {
		    	System.out.println(a[i]);
		    }
			}
		}


}
