package demo.paractise.strings;
//WAJP TO DISPLAY THE FIRST HALF OF THE STRINGS IN REVERSE ORDER
public class Solution5 {
	 public static void main(String[] args) {
			String s = "programming";
			for(int i=s.length()/2;i>=0;i--) {
				System.out.print(s.charAt(i)+" ");
			}
		}
}

