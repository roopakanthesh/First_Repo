package demo.paractise.strings;
 //WAJP TO FIND FREQUENCY OF THE ONE LETTER
public class Solution16 {
	public static void main(String[] args) {
		int count = 0;
		String s = "String";
		char ch = 'r';
		for(int i=0;i<s.length();i++) {
			if(ch==s.charAt(i)) {
				count++;
			}
		}
		System.out.println("Frequency of"+" "+ch+" = is"+count);
	}

}
