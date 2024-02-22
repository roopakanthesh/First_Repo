package com.kodnest.Demoexception;

public class ClassNotfoundException {
	public static void main(String[] args) {
		try {
			Class.forName("Demo");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
	}
	}

}
