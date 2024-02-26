package com.kodnest.jfc;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_ListUsingLoops {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println(ll.size());
		
		System.out.println("for-loop");
		for(int i=0;i<ll.size();i++) {
			System.out.print(ll.get(i)+" ");
		}
		System.out.println();
		
		 System.out.println("Using iterator");
		    Iterator iterator = ll.iterator();
		    while(iterator.hasNext()) {
		    	System.out.print(iterator.next()+" ");
		    }
		    System.out.println(); 
      }
	}
