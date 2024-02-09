package demo.array.com;

import java.util.Arrays;

public class BinarySearchArray {
	public static void main(String[] args) {
	int a[] = {13,34,67,89,44,76};
	System.out.println("Before Sorting");
    for(int i=0;i<=a.length-1;i++) {
    	System.out.println(a[i]+" ");
    }
	
	Arrays.sort(a);
	
	System.out.println("After Sorting");
        for(int i=0;i<=a.length-1;i++) {
         System.out.print(a[i]+" ");
        }
	}
}
