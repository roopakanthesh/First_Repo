package demo.DataStructures;

import java.util.Scanner;

public class DoublyLinkedListApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DoublyLinkedList l1 = new DoublyLinkedList();
		while (true) {
			System.out.println("Pess1----->INSERT AT REAR");
			System.out.println("Pess2----->DELETE AT REAR");
			System.out.println("Pess3----->INSERT AT FRONT");
			System.out.println("Pess4----->DELETE AT FRONT");
			System.out.println("Pess5----->DISPLAY REVERSE");
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
				l1.forwardDisplay();
				break;
			case 6:
				l1.reverseDisplay();
				break;
			default:
				System.exit(0);
			}
		}
	}

}
