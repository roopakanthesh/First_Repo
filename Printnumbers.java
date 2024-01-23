package com.kodnest.threrads;

public class Printnumbers implements Runnable{
	public void run(){
		Thread currentThread = Thread.currentThread();
	    System.out.println(currentThread);

	for(int i=1;i<=10;i++) {
		System.out.println(i);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
			}
	
	}

}
