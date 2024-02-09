package com.kodnest.ce;

public class MyException extends Exception {
	
	public MyException() {
		super("Insufficient funds, try entering a less amount");
	}

}
