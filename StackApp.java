package demo.DataStructures;

import java.util.Scanner;

public class StackApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter stack size");
		int n=scan.nextInt();
		Stack stack = new Stack(n);
		while(true) {
			System.out.println("press1----------->PUSH");
			System.out.println("press2----------->POP");
			System.out.println("press3----------->DISPLAY");
			System.out.println("Any other number----->STOP");
			System.out.println("Enter your choice");
			int choice = scan.nextInt();
			switch(choice) {
			case 1 : stack.push();
			break;
			case 2 : stack.pop();
			break;
			case 3 : stack.display();
			break;
			default : System.exit(0);
			break;
			}
		}
	}

}
