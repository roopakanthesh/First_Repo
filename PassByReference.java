package com.kodnest.banking;

public class PassByReference {
	public static void main(String[] args) {
		int x = 10;
		modifyprimitive(x);
		System.out.println("Primitive : "+x);
		StringBuilder sb = new StringBuilder("Hello");
		modifyObject(sb);
		System.out.println("Object : "+sb.toString());
		
	}
	public static void modifyObject(StringBuilder str) {
		str.append("World");
		
	}
	public static void modifyprimitive(int num) {
	      num =20;		
	}

}
