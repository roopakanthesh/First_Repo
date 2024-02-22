package com.kodnest.threrads;

public class Main {
	public static void main(String[] args) {
		//Thread currentThread = Thread.currentThread();
	    //System.out.println(currentThread);
		Printalpabets a = new Printalpabets();
		
		
		Printnumbers b = new Printnumbers();

		
		Thread thread1 = new Thread(a);
		Thread thread2 = new Thread(b);
		
		thread1.start();
		thread2.start();
	}

	
}



