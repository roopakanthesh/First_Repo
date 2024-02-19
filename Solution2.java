package demo.paractise.strings;
    ////WAJP TO DISPLAY ALL THE CHARACTERS SEPARATED IN REVERSE ORDER
public class Solution2 {
	public static void main(String[] args) {
        String s = "programming";
        for(int i=s.length()-1;i>=0;i--) {
        	System.out.print(s.charAt(i)+" ");
        }
	}

}
