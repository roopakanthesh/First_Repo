package com.kodnest.jfc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class jf {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(30);
		al.add(50);
		al.add(50);
		System.out.println(al);
		
		//you dont remove duplivate values
		Collections.sort(al);
		
		//remove duplicate values
		//TreeSet ts = new TreeSet(al);
		System.out.println(al);
		
	}

}
