package com.kodnest.threrads;

public class MultiThreadStates {
	public static void main(String[] args) {
		
		Task3 task3 = new Task3();
		Thread thread = new Thread(task3);
	    thread.start();
	    for(int i=0;i<=10;i++) {
		System.out.println("main() start");
		Thread.currentThread().yield();
	}

}

}




 class Task3 implements Runnable{
	 public void run() {
		 for(int i=0;i<=5;i++) {
			 System.out.println("main() stop");
	 }
	
}
 }