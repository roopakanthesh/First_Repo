package com.kodnest.jfc;

import java.util.Collection;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

public class Legacy_class {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.add(20);
		s.add(30);
		System.out.println(s);
		
		Vector v = new Vector();
		v.add(40);
		v.add(60);
		System.out.println(v);

		Hashtable h = new Hashtable();
		h.put(1, 10);
		h.put(3, 40);
		System.out.println(h);

		Properties p = new Properties();
		p.put(3, 10);
		p.put(2, 10);
		System.out.println(p);

      //	Enumeration e = new Enumeration();
	//	Dictionary d = new Dictionary();
	}

}
