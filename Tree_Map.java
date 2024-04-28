package com.kodnest.jfc;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;


public class Tree_Map {
	public static void main(String[] args) {
		TreeMap<Integer,String> treemap = new TreeMap<Integer,String>();
		treemap.put(1, "Java");
		treemap.put(5, null);
		treemap.put(3, "CSS");
		treemap.put(8, null);
		treemap.put(4, "C");
		System.out.println(treemap);
		Set<Integer> keySet = treemap.keySet();
		System.out.println(keySet);
		Collection
		<String> values = treemap.values();
		System.out.println(values);
	}

}
