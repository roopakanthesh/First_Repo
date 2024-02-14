package demo.array3.com;

import java.util.Scanner;

public class ThreeDarray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//size of an array
		System.out.println("User! please enter the size of an array");
		int a =scan.nextInt();
		int b =scan.nextInt();
		int c = scan.nextInt();
		
		//creation of an array
		int m[][][] = new int[a][b][c];
		
		//read the elements
		
		System.out.println("User! please enter the elements");
		for(int i=0;i<=m.length-1;i++) {
			for(int j=0;j<=m[i].length-1;j++) {
				for(int k=0;k<=m[i][j].length-1;k++) {
					m[i][j][k]=scan.nextInt();
				}
				
			}
		}
			
		//write the elements
			System.out.println("The matrix is : ");
		for(int i=0;i<=m.length-1;i++) {
			for(int j=0;j<=m[i].length-1;j++) {
				for(int k=0;k<=m[i][j].length-1;k++) {
					System.out.print(m[i][j][k]+" ");
				}
				System.out.println();					
		}
			System.out.println();

}
	}
}