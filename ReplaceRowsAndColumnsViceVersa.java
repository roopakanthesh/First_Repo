package demo.array.com;

public class ReplaceRowsAndColumnsViceVersa {
public static void main(String[] args) {
		
		//creation of an array
        int a[][] = {{10,20,30},{40,50,60},{70,80,90}};

		
		//display the elements
        System.out.println("The elements are:");
				for(int i=0;i<a.length;i++) {
					for(int j=0;j<a[i].length;j++) {
							System.out.print(a[j][i]+" ");
						}
					System.out.println();			
				}
				
	}
	}


