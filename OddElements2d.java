package demo.array.com;

public class OddElements2d {
public static void main(String[] args) {
		
		//creation of an array
        int a[][] = {{10,11,21},{40,55,65},{85,80,111}};

		
		//display the elements
        System.out.println("The odd elements are:");
				for(int i=0;i<a.length;i++) {
					for(int j=0;j<a[i].length;j++) {
						if(a[i][j]%2== 1){
							System.out.println(a[i][j]);
						}
								
				}
				
	}
}
}
