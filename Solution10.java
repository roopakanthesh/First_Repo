package demo.paractise.strings;
//WAJP TO FIND THE GIVEN STRING IS PALLINDROME
public class Solution10 {
	public static void main(String[] args) {
		String s = "roopa";
		StringBuffer str = new StringBuffer(s);
		 StringBuffer reverse = str.reverse();
		String string = reverse.toString();
		if(s.equals(reverse.toString())) {
          System.out.println("pallindrome");
		}
		else
		{
			System.out.println("not pallindrome");
		}
}
}
