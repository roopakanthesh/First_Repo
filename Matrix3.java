package demo.array.com;

import java.util.Scanner;

public class Matrix3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//size of an array
		System.out.println("User please enter number of rows in the matrix");
		int row = scan.nextInt();
		System.out.println("User please enter number of column in the matrix");
		int col = scan.nextInt();
		
		//creation of an array
		int a[][] = new int [row][col];
		
		//read the elements
		System.out.println("User! please enter the values");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j] = scan.nextInt();
			}
		}
		
		//display the elements
		System.out.println("The matrix is:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==0) {
				System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
		
	}
}
