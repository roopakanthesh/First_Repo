package demo.practise1.com;
import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		armstrongnumber(n);
	}
	
		static void armstrongnumber(int n) {
			int count=0;
			int on=0;
			int sum=0;
		while(n>0) 
		{
			n=n/10;
			count++;
		}
		if(on==sum)
		{
			System.out.println("ArmStrong Number");
		}
		else
		{
	System.out.println("Not ArmStrong Number");
	}
      }
}

