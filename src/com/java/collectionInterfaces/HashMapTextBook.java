package com.java.collectionInterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class HashMapTextBook {
	
	 public void displayMap(Map<Integer,String> book_map) {
		 Set<Integer> keys = book_map.keySet();
		 //TreeSet<Integer> sortedKeys = new TreeSet<>(keys);
		 
		 for(Integer key:keys) {
			 System.out.println(key + "\t" + book_map.get(key));
		 }
		 System.out.println("Map size : " + book_map.size() + "\nIs the map empty :" +book_map.isEmpty());
		 
	 }
}
