package com.kodnest.jfc;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_usingLoops {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al.size());
		//System.out.println(al);
		
		
		System.out.println("for-loop");
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+ " ");
		}
		System.out.println();
		
		System.out.println("while-loop");
		int i=0;
		while(i<al.size()) {
			System.out.print(al.get(i)+" ");
			i++;
		}
		System.out.println();
		
		System.out.println("do-while");
		i=0;
		do {
			System.out.print(al.get(i)+" ");
			i++;
		}while(i<al.size());
		System.out.println();
		
		System.out.println("foreach-loop");
	    for(Object j :al) {
		      System.out.print(j+" ");
	}
	    System.out.println();
	    
	    
	    System.out.println("Using iterator");
	    Iterator iterator = al.iterator();
	    while(iterator.hasNext()) {
	    	System.out.println(iterator.next());
	    }
	    
	}
		
	}


