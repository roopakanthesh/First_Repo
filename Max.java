package demo.array.com;

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//size of an array
		System.out.println("User! please enter the size of the array");
		int size = scan.nextInt();
		
		//create an array
		byte a[] = new byte[size];
		
		//read elements into the array
		System.out.println("enter the elements of an array");
		for(int i=0;i<=a.length-1;i++) {
			a[i]=scan.nextByte();
		}
		//write the elements from the array
		System.out.println("the elements are:");
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
			//find the maximum element of an array
			
			//assuming first element of an array as max value
			byte max = a[0];
			for(int i=0;i<=a.length-1;i++) {
				if(a[i]>max)
				{
					// reassumption of max value
					max = a[i];
				}
			}
			System.out.println("The maximum elements is="+max);
					
				}
			}
			
