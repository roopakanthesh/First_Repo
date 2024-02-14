package com.kodnest.banking;


class color{
	void display() {
		System.out.println("Color");
	}
}

 class Red extends color{
	 void reddisplay() {
		 System.out.println("Red color");
	 }
 }
      public class Democolor {
    	  public static void main(String[] args) {
			//upcasting
    		  color c =new Red();
    		  c.display();
    		  
    		  //downcasting
    		  ((Red) c).reddisplay();
		}

}
