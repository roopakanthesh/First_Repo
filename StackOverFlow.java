package com.kodnest.Demoexception;

public class StackOverFlow {
	public static void main(String[] args) {
		//Stack over flow error
		add();
	}
      static void add() {
    	  add();
      }
}
