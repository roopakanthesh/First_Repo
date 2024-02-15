package demo.DataStructures;

import java.util.Scanner;

public class CircularQueueApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of circular queue");
		int n=scan.nextInt();
		CircularQueue circularqueue = new CircularQueue(n);
		while(true) {
			System.out.println("press1----------->INSERTING");
			System.out.println("press2----------->DELETING");
			System.out.println("press3----------->DISPLAY");
			System.out.println("Any other number------->STOP");
			System.out.println("Enter your choice");
			int choice = scan.nextInt();
			switch(choice) {
			case 1 : circularqueue.insert();
			break;
			case 2 : circularqueue.delete();
			break;
			case 3 : circularqueue.display();
			break;
			default : System.exit(0);
			break;
			}
		}
	}
}
