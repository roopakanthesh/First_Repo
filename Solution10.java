package demo.kodnest.practisepatterns;

public class solution10 {
	public static void main(String[] args) {
		for(int row=1;row<=10;row++) {
			for(int col=1;col<=10;col++) {
				if(row==1 || col==1 || row==5 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
	System.out.println();
		}
	}
}
	