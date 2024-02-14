package demo.array3.com;

import java.util.Scanner;

public class DisplayTheSquareShapeElementsonly {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the row value of array");
		int row = scan.nextInt();
		System.out.println("enter the col value of array");
		int col = scan.nextInt();
		
		
	//declaration or creation of an 2D array
		int[][] a = new int[row][col];
	
		//read the elements from an 2D array
		System.out.println("User! please enter the elements of an array");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j] = scan.nextInt();
			}
		}
			
		//write elements from the array
			System.out.println("The elements of array are:");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" "); 
				}
				System.out.println();
				}
				}	
			}

		