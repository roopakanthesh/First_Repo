package demo.kodnest.practisepatterns;

public class solution16 {
	public static void main(String[] args) {
		for(int row=1;row<=10;row++) {
			for(int col=1;col<=10;col++) {
				if(col==1 || col==5 || col==10 ||row==1 )
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

