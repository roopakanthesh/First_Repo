package demo.paractise.strings;

public class Solution17 {
	public static void main(String[] args) {
		int count = 0;
		String s = "java";
		char[]  str =  s.toCharArray();
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
			if(str[i]==s.charAt(j)) {
				count++;
			}
		}
System.out.println("Frequency of"+" "+str[i]+" = is "+count);
	}

}
}