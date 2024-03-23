package com.kodnest.jfc;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		LinkedHashSet al = new LinkedHashSet();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(30);
		al.add(10);
		al.add(40);
		al.add("abcd");
		al.add(null);
     System.out.println(al);
//     for(int i=0;i<al.size();i++) {
//   	 System.out.println(al.get(i));
//   }
     for(Object a : al) {
    	 System.out.println(a);
     }
     Iterator iterator = al.iterator(); 
     while(iterator.hasNext()) {
    	 System.out.println(iterator.next());
     }
		
	}

}
