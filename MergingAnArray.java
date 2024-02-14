
package demo.array3.com;

import java.util.Scanner;

public class MergingAnArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//size of an array
		System.out.println("User! please enter the size of an 1st array");
		int x = scan.nextInt();
		System.out.println("User! please enter the size of an 2nd array");
		int y = scan.nextInt();
		
		//creation of an array
		int a[] = new int[x];
		int b[] = new int[y];
		int c[] = new int[(x+y)];
		
		//read the elements
		System.out.println("User! please enter the elements of an array-1");
        for(int i=0;i<=a.length-1;i++) {
        	a[i] = scan.nextInt();
        }
        
        System.out.println("User! please enter the elements of an array-2");
        for(int i=0;i<=a.length-1;i++) {
        	b[i] = scan.nextInt();
        }
        
        //merge the elements
        for(int i=0;i<=c.length-1;i++) {
        	if(i<=a.length-1) {
        		c[i] = a[i];
        	}
        	else
        	{
        		c[i] = b[i-a.length];
        	}
        }
        	
        	//display the elements
        	System.out.println("Merging elements are : ");
        	for(int i=0;i<=c.length-1;i++) {
        		System.out.print(c[i]+" ");
        		
        		
        	}
        }
	}
