package demo.DataStructures;

import java.util.Scanner;

public class DoublyLinkedList {
	class Node {
		Node prelink;
		int data;
		Node nextlink;
	}

	private Node first;
	private Scanner scan = new Scanner(System.in);

	public void insertrear() {
		Node temp;
		System.out.println("Enter an element");
		int elem = scan.nextInt();
		Node newNode = new Node();
		newNode.data = elem;
		newNode.prelink = null;
		newNode.nextlink = null;
		if (first == null) {
			first = newNode;
		} else {
			temp = first;
			while (temp.nextlink != null) {
				temp = temp.nextlink;
			}
			temp.nextlink = newNode;
			temp.prelink = temp;
		}
	}

	public void deleterear() {
		Node temp;
		if (first == null) {
			System.out.println("Deletion not possible");
		} else if (first.nextlink == null) {
			System.out.println("element deleted is" + first.data);
			first = null;
		} else {
			temp = first;
			while (temp.nextlink.nextlink != null) {
				temp = temp.nextlink;
			}
			System.out.println("element deleted is" + temp.nextlink.data);
			temp.nextlink = null;
		}
	}

	public void insertfront() {
		Node temp;
		System.out.println("Enter an element");
		int elem = scan.nextInt();
		Node newNode = new Node();
		newNode.data = elem;
		newNode.nextlink = null;
		newNode.prelink = null;
		if (first == null) {
			first = newNode;
		} else {
			newNode.nextlink = first;
			first = newNode;
		}
	}

	public void deletefront() {
		Node temp;
		if (first == null) {
			System.out.println("Deletion not possible");
		} else if (first.nextlink == null) {
			System.out.println("element deleted is" + first.data);
			first = null;
		} else {
			System.out.println("Element deteted is " + first.data);
			first = first.nextlink;
			first.prelink = null;
		}
	}

	public void forwardDisplay() {
		Node temp;
		if (first == null) {
			System.out.println("Display not possible");
		} else if (first.nextlink == null) {
			System.out.println(first.data);
		} else {
			temp = first;
			while (temp != null) {
				System.out.println(temp.data + " ");
				temp = temp.nextlink;
			}
			System.out.println();
		}
	}

	public void reverseDisplay() {
		Node temp;
		if (first == null) {
			System.out.println("Display not possible");
		} else if (first.nextlink == null) {
			System.out.println(first.data);
		} else {
			temp = first;
			while (temp.nextlink != null) {
				temp = temp.nextlink;
			}
			while (temp != null) {
				System.out.println(temp.data + " ");
				temp = temp.prelink;
			}
			System.out.println();

		}
	}
}
