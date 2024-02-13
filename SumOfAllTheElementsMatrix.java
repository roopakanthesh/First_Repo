package demo.array.com;

public class SumOfAllTheElementsMatrix {
	public static void main(String[] args) {
		
		//creation of an array
		int a[][] = {{10,20,30},{40,50,60},{70,80,90}};

		
		//display the elements
		int sum = 0;
				for(int i=0;i<a.length;i++) {
					for(int j=0;j<a[i].length;j++) {
						sum = sum + a[i][j];
					}
				}
					System.out.println("The sum of Matrix is" + sum);
	}
	}
