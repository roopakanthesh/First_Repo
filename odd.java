package demo.practise1.com;

import java.util.Scanner;

public class odd {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			System.out.println("User! please enter the number");
			int sum = 0;
		while(n>0)
		{
			int rem = n%10;
			if(rem%2==0)
			{
				sum=sum+rem;
			}
			int quo=n/10;
			}
		}

}
