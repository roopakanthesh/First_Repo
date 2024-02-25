package com.kodnest.jfc;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;


public class Fail_Fast_Safe {
	public static void main(String[] args) {
		CopyOnWriteArrayList a = new CopyOnWriteArrayList();
		a.add(20);
		a.add(30);
		a.add(40);
//		System.out.println("using for-loop");
//		for(int i=0;i<a.size();i++) {
//			System.out.println(a.get(i));
//			a.add(99);
//	}
//		int i=0;
//		while(i<a.size()) {
//			System.out.println(a.get(i));
//			i++;
//			a.add(99);
		// }
//		int i=0;
//		do {
//			System.out.println(a.get(i));
//			i++;
//			a.add(99);
//		}while(i<a.size());
		
//		for(Object object : a) {
//			System.out.println(object);
//			a.add(99);
//	}
		Iterator iterator = a.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			a.add(99);
			
		}
		System.out.println(a);
		
	}

}
