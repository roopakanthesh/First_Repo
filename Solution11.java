package demo.paractise.strings;
//WAJP TO CONVERT HELLO JAVA PROGRAM INTO OLLEH AVAJ MARGORP  
public class Solution11 {
         public static void main(String[] args) {
			String s = "hello java program";
			String[] str = s.split(" ");
			for(int i=0;i<str.length;i++) {
				StringBuffer string = new StringBuffer(str[i]);
				System.out.print(string.reverse()+" ");
			}
		}
}
