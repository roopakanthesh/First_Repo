package demo.paractise.strings;
//WAJP TO DISPLAY THE FIRST HALF OF THE STRINGS
public class Solution3 {
         public static void main(String[] args) {
			String s = "programming";
			for(int i=0;i<=s.length()/2;i++) {
				System.out.print(s.charAt(i)+" ");
			}
		}
}
