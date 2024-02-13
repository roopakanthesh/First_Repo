package demo.array.com;

import java.util.Scanner;

public class StudentMarks2D {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//2D-array creation that contains 3 classes and 3 schools
		
		System.out.println("User! please enter the total number of classes");
		int classes_size = scan.nextInt();
		System.out.println("User! please enter the total number of students");
		int students_size = scan.nextInt();
		
		int m[][] = new int[classes_size][students_size];
		
		//initialization
		System.out.println("enter the marks of"+students_size+" students"+"present in"+classes_size+" classes are");
		for(int classes = 0; classes < m.length; classes++) {
			for(int students = 0; students <m[classes].length; students++ ) {
				m[classes][students]=scan.nextInt();
			}
		}
		
		
		//displaying the marks
		System.out.println("The marks of"+students_size+" students"+"present in"+classes_size+" classes are");
		
		for(int classes = 0; classes < m.length; classes++) {
			for( int students = 0; students < m[classes].length; students++) {
				System.out.println(m[classes][students]);
			}
		}
	}
}
