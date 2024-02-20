package demo.practise1.com;
import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
		System.out.println("User! please enter a number");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		sqrtnumber(n);
	}
	//finding the square and cube root of number
	
       static void sqrtnumber(int n) {
    	   System.out.println("The square root="+Math.sqrt(n));
    	   System.out.println("The cube root="+(int)Math.cbrt(n));
       }
}
