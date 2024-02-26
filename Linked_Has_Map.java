package com.kodnest.jfc;

import java.util.LinkedHashMap;

public class Linked_Has_Map {
	public static void main(String[] args) {
	LinkedHashMap<Integer,String> hashmap = new LinkedHashMap<Integer,String>();
	hashmap.put(1, "Java");
	hashmap.put(5, "HTML");
	hashmap.put(3, "CSS");
	hashmap.put(8, "JS");
	hashmap.put(4, "C");
	System.out.println(hashmap);
}
}