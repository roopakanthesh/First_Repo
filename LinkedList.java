package demo.DataStructures;

import java.util.Scanner;

public class LinkedList {
	class Node {
		int data;
		Node link;
	}

	private Node first;
	private Scanner scan = new Scanner(System.in);

	public void insertrear() {
		Node temp;
		System.out.println("Enter an element");
		int elem = scan.nextInt();
		Node newNode = new Node();
		newNode.data = elem;
		newNode.link = null;
		if (first == null) {
			first = newNode;
		} else {
			temp = first;
			while (temp.link != null) {
				temp = temp.link;
			}
			temp.link = newNode;
		}
	}

	public void deleterear() {
		Node temp;
		if (first == null) {
			System.out.println("Deletion not possible");
		} else if (first.link == null) {
			System.out.println("element deleted is" + first.data);
			first = null;
		} else {
			temp = first;
			while (temp.link.link != null) {
				temp = temp.link;
			}
			System.out.println("element deleted is" + temp.link.data);
			temp.link = null;
		}
	}

	public void insertfront() {
		Node temp;
		System.out.println("Enter an element");
		int elem = scan.nextInt();
		Node newNode = new Node();
		newNode.data = elem;
		newNode.link = null;
		if (first == null) {
			first = newNode;
		} else {
			newNode.link = first;
			first = newNode;
		}
	}

	public void deletefront() {
		if (first == null) {
			System.out.println("Deletion not possible");
		} else if (first.link == null) {
			System.out.println("element deleted is" + first.data);
			first = null;
		} else {
			System.out.println("Element deteted is " + first.data);
			first = first.link;
		}
	}

	public void display() {
		Node temp;
		if (first == null) {
			System.out.println("Display not possible");
		} else if (first.link == null) {
			System.out.println(first.data);
		} else {
			temp = first;
			while (temp != null) {
				System.out.println(temp.data + " ");
				temp = temp.link;
			}
			System.out.println();
		}
	}
}
