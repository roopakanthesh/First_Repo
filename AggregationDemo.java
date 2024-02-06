package com.kodnest.aggregation;

 class Pilot{
	 String name;
     public Pilot(String name){
    	 this.name = name;
    	 	}
     void fly() {
    	 System.out.println(name + " is flying the plane");
 }
 }

 
 class Airline{
	 String airname;
	 Pilot pilot;
	
	 
	 public Airline(String airname,Pilot pilot) {
		 this.pilot = pilot;
		 this.airname = airname;
	 }
		 void operate() {
			 System.out.println(airname + " operating........");
			 pilot.fly();
			 
	 }
 }

public class AggregationDemo {
	public static void main(String[] args) {
		Pilot karthik = new Pilot("karthik");
		
	Airline airline = new Airline("indigo",karthik);
	airline.operate();
	
	airline = null;
	// airline.operate();
	karthik.fly();
	}
}