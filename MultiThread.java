package com.kodnest.threrads;

 public class MultiThread {
	public static void main(String[] args) {
		System.out.println("main() start");

		Task2 task2 = new Task2();
		Thread thread = new Thread(task2);
		
		thread.start();
		try {
			thread.join(1,9999);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main() stop");
	}
 }
		
		
		
 class Task2 implements Runnable {
	 public void run() {
		 for(int i=1;i<=10;i++) {
			 System.out.println(i);
			 try {
				 Thread.sleep(1000);
			 } catch (InterruptedException e) {
				 e.printStackTrace();
			 }
		 }
		 
	 }
 }
 
		
		
		
		
		
		
		
		
		
	