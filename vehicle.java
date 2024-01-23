package com.kodnest.abstraction;

abstract class vehicle {
	
	//concrete method
	void engine() {
	System.out.println("engine");
	}
	
	
	
	//abstract method
   abstract void gear();
   
}
   
   abstract class Bike extends vehicle{
	   void engine() {
			System.out.println("Bike gear");
		}
   }
		
		
   
  abstract class Car extends vehicle{

	void engine() {
		System.out.println("Car gear");
	}
  }
