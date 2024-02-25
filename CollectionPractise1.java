package com.kodnest.jfc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class CollectionPractise1 {
		  public static void main(String[] args) {
			  Scanner scanner = new Scanner(System.in);
			  // Read the first playlist
			  System.out.println("enter playlist-1");
			   ArrayList<Integer> playlist1 = new ArrayList<>();
			   while (scanner.hasNextInt()) {
				   playlist1.add(scanner.nextInt());
			   }
			  
			   // Read the second playlist
			   System.out.println("enter playlist-2");
			   ArrayList<Integer> playlist2 = new ArrayList<>();
			   while (scanner.hasNextInt()) {
				   playlist2.add(scanner.nextInt());
			   }
				  
			   // Create a HashSet to store unique song IDs
			   HashSet<Integer> uniqueSongIDs = new HashSet<>();
				  
			   // Add all elements from the first playlist
			   uniqueSongIDs.addAll(playlist1);
			   
			   // Add all elements from the second playlist
			   uniqueSongIDs.addAll(playlist2);
			   
			   // Print the result
			   for (int songID : uniqueSongIDs) {
				   System.out.print(songID + " ");
			   }
			   scanner.close();
		  }
}
			   
			   
				   
				   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   

			  








