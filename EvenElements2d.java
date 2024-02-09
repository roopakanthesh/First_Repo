package demo.array.com;

public class EvenElements2d {
	public static void main(String[] args) {
		
		//creation of an array
        int a[][] = {{10,20,30},{40,50,60},{70,80,90}};

		
		//display the elements
        System.out.println("The even elements are:");
				for(int i=0;i<a.length;i++) {
					for(int j=0;j<a[i].length;j++) {
						if(a[i][j]%2 == 0){
							System.out.println(a[i][j]);
						}
								
				}
				
	}
	}
}
