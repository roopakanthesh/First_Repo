package com.kodnest.threrads;

public class Main1 {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(8);
	     System.out.println(Thread.currentThread());
	     
	     for(int i=0;i<=10;i++) {
	 		if(i%2!=0) {
	 			System.out.println(i);
	 		}
	 	}
	     Task task = new Task();
	     task.start();
	}
}



class Task extends Thread {
	public void run() {
		System.out.println(Thread.currentThread());
	for(int i=0;i<=10;i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
	
	}
}