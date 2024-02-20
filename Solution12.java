package demo.paractise.strings;
  //WAJP TO DISPLAY ALL THE STRINGS IN REVERSE ORDER
public class Solution12 {
	public static void main(String[] args) {
				String s = "hello java program";
				String[] str = s.split(" ");
				for(int i=str.length-1;i>=0;i--) {
					System.out.print(str[i]+" ");
				}
			}
	}

