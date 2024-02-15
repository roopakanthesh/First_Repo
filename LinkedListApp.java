package demo.DataStructures;

import java.util.Scanner;

public class LinkedListApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList l1 = new LinkedList();
		while (true) {
			System.out.println("Pess1----->INSERTREAR");
			System.out.println("Pess2----->DELETEREAR");
			System.out.println("Pess3----->INSERTFRONT");
			System.out.println("Pess4----->DELETEFRONT");
			System.out.println("Pess5----->DISPLAY");
			System.out.println("Any other numbers----->STOP");
			System.out.println("Enter your choice");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				l1.insertrear();
				break;
			case 2:
				l1.deleterear();
				break;
			case 3:
				l1.insertfront();
				break;
			case 4:
				l1.deletefront();
				break;
			case 5:
				l1.display();
				break;
			default:
				System.exit(0);
			}
		}
	}

}
