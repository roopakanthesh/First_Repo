package com.kodnest.threrads;

public class Printalpabets implements Runnable{
	 public void run() {
		 Thread currentThread = Thread.currentThread();
		    System.out.println(currentThread);

		    
			for(char c='a';c<='l';c++) {
				System.out.println(c);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
	 }
			
	}
	 
}

