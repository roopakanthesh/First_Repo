package com.kodnest.jfc;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Collection2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter playlist-1");
		String playlist1 = scan.nextLine();
		String[] playlist1song = playlist1.split(" ");
		
		System.out.println("Enter playlist-2");
		String playlist2 = scan.nextLine();
		String[] playlist2song = playlist2.split(" ");
		
		ArrayList al1 = new ArrayList();
		for (Object object : playlist1song) {
			al1.add(object);
		}
		for (Object object : playlist2song) {
			al1.add(object);
		}
		
		TreeSet ts = new TreeSet();
		ts.addAll(al1);
		System.out.println(ts);
		
	}
}



