package demo.paractise.strings;
//WAJP TO DISPLAY THE SECOND HALF OF THE STRINGS
public class Solution4 {
	 public static void main(String[] args) {
			String s = "programming";
			for(int i=(s.length()/2)+1;i<=s.length()-1;i++) {
				System.out.print(s.charAt(i)+" ");
			}
		}
}

