package com.kodnest.strings;

public class String3of1 {
	public static void main(String[] args) {
		String str = "java";
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
			}
		}
	}

}
