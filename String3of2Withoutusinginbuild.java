package com.kodnest.strings;

public class String3of2Withoutusinginbuild {
          public static void main(String[] args) {
        	  String str = "java";
        	  String s ="";
              for(int i=str.length()-1;i>=0;i--){
              s = s +str.charAt(i);
              }
              System.out.println(s); //reverse the string
		}
}
