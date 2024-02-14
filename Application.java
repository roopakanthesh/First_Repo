package com.kodnest.banking;

public class Application {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.getPmoney());
		System.out.println(child.cmoney);
		
		
		Parent parent = new Parent();
		System.out.println(parent.getPmoney());
		parent.setPmoney(2000);
		System.out.println(parent.getPmoney());
	}

}
