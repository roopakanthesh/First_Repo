package demo.kodnest.practisepatterns;

public class Solution1 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j>=3;j--) {
				System.out.print("*");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
		}System.out.println();
	}
}
