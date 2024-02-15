package demo.DataStructures;

import java.util.Scanner;

public class ArrayApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int n=scan.nextInt();
		Array array = new Array(n);
		while(true) {
			System.out.println("press1----------->INSERTING");
			System.out.println("press2----------->DELETING");
			System.out.println("press3----------->DISPLAY");
			System.out.println("Any other number for existing");
			System.out.println("Enter your choice");
			int choice = scan.nextInt();
			switch(choice) {
			case 1 : array.insert();
			break;
			case 2 : array.delete();
			break;
			case 3 : array.display();
			break;
			default : System.exit(0);
			break;
			}
		}
	}
}
