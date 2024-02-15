package com.kodnest.banking;

 class Pizza {
	//constructor
	public Pizza() {
		System.out.println("Making a basic pizza");
	}
 }

class Margarita extends Pizza {
	//constructor
	public Margarita () {
		System.out.println("Adding pepperoni on top");
	}
}

  public class TestPizza {
	public static void main(String[] args) {
		Margarita pizza = new Margarita ();
	}
}
