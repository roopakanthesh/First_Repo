package demo.practise;

import java.util.Scanner;

public class AddTwoNumbers {
	void printSum() {
		Thread currentThread = Thread.currentThread();
	    System.out.println(currentThread);

		Scanner scan = new Scanner(System.in);
		System.out.println("enter number-1");
		int a=scan.nextInt();
		System.out.println("enter number-2");
		int b=scan.nextInt();
		int c=a+b;
		System.out.println("sum of number is:"+c);
		

		scan.close();
	}

}
