package com.kodnest.banking;

class A{
	int age;
}

class B extends A{
	public B() {
	}
	
	public B(int i) {
		//super class method is calling its parent (class A)
		
	}
	String name;
}


public class Solution {
	public static void main(String[] args) {
		B b = new B();
		B b1 = new B(10);
		System.out.println(b.name);
		System.out.println(b.age);
		
	}

}
