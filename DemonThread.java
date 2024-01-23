package com.kodnest.threrads;

public class DemonThread {
	public static void main(String[] args) {
			
		     Task1 task1 = new Task1("typing");
		     Task1 task2 = new Task1("autoCorrection");
		     Task1 task3 = new Task1("autoSuggestion");
		     
		     task1.start();
		     
		     task2.setDaemon(true);
		     task3.setDaemon(true);
		     
		     task2.setPriority(1);
		     task3.setPriority(1);
		     
		     task2.start();
		     task3.start();
		}
}


class Task1 extends Thread{ 
	public Task1(String name) {
		super(name);
	}
	
public void typing() {
	for(int i=0;i<=3;i++) {
		System.out.println("typing........");
			
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}
}

public void autoCorrection() {
	for(; ;) {
		System.out.println("autoCorrection");
			
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}

public void autoSuggestion() {
	for(; ;) {
		System.out.println("autoSuggestion");
			
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				
			}
	}
}
 
public void run() {
	if(this.getName().equalsIgnoreCase("typing")) {
		typing();
	}
	else if(this.getName().equalsIgnoreCase("autoCorrection")) {
		autoCorrection();
	}
	else if(this.getName().equalsIgnoreCase("autoSuggestion")) {
		autoSuggestion();
	}
}


}

		
	