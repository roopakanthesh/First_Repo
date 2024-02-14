package com.kodnest.banking;

class parent1{
	//hided
	static void display() {
		System.out.println("1");
	}
}

  class child1 extends parent1{
	  static void display() {
		  System.out.println("2");
	  }
  }
    public class Color1 {
	    public static void main(String[] args) {
			parent1 obj1 = new parent1();
			parent1 obj2 = new child1();
			child1 obj3 = new child1();
			
			obj1.display();
			parent1.display();
			obj3.display();
		}




}
