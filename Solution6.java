package demo.paractise.strings;
//WAJP TO DISPLAY THE SECOND HALF OF THE STRINGS IN REVERSE ORDER
public class Solution6 {
		 public static void main(String[] args) {
				String s = "programming";
				for(int i=s.length()-1;i>s.length()/2;i--) {
					System.out.print(s.charAt(i)+" ");
				}
			}
	}

