package com.kodnest.Demoexception;

public class Solution {
	public static void main(String[] args) {
		try {
			System.out.println("program started");
			String s = "java";
			System.out.println(s.charAt(-1));
		}
		
		catch(Exception e) {
			System.out.println("User! Please enter within the boundary index element");
		}
				finally {
			System.out.println("program ended");
		}
		
}
}

