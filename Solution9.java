package demo.paractise.strings;
//WAJP CONVERT MUTABLE INTO IMMUTABLE STRING
public class Solution9 {
	public static void main(String[] args) {
		String s = "programming";
		StringBuffer str = new StringBuffer(s);
		System.out.println(str.reverse());
	}
}
