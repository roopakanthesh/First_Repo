package demo.practise1.com;

import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("User! please enter a number");
		singleDigitSum(n);
	}
      static void singleDigitSum(int n) {
    	  int rem=0;
		int sum=0;
		while(n>9){
		sum=0;
		rem=0;
		while(n>0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum+">>>>");
			n=sum;
		}
		System.out.println("The sum is"+sum);
	}
}
