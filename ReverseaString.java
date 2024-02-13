package demo.array.stringpractise;

public class ReverseaString {
           public static void main(String[] args) {
			String s = "hello";
			System.out.println(s);
			for(int i=s.length()-1;i>=0;i--) {
				System.out.println(s.charAt(i));
			}
}
}