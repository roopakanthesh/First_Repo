package demo.array3.com;

public class ThreeDperticular {
	public static void main(String[] args) {
		int[][][]a ={{{1,2,3},{1,2,3},{1,2,3}}};
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				for(int k=0;k<=a[i][j].length-1;k++) {
					System.out.print(a[i][j][k]+" ");
				}
			System.out.println();
			}
			System.out.println();
		}

}
}
