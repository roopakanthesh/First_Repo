package demo.kodnest.pattern;

public class q2 {
	public static void main(String[] args) {
		int n=3;
		int baseNum=10;
		for(int i=1;i<=n;i++) {
			int num = baseNum;
			for(int j=1;j<=i;j++) {
				System.out.print(num);
				if(j<i) {
					System.out.print("*");
				}
			num+=10;
			}
			System.out.println();		
		}
	}
}
