package com.java.collectionInterfaces;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>(); // elemnts not in order
		Set<String> orderedset = new TreeSet<>();
		orderedset.add("9");
		orderedset.add("4");
		orderedset.add("8");
		orderedset.add("7");
		//add element to set
		//return boolean to tell if the element added or not
		//return true first time
		boolean added = set.add("hello");
		//return false if trying to add same element
		boolean added2 = set.add("hello");
		System.out.println("added is " +added + "\nadded2 is " + added2);
		//using Set.of()
		Set<String> set2 = Set.of("hello","world","1","2","3");
		//print set using Iterator
		Iterator<String> iterator = set2.iterator(); 
		while(iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}
		Iterator<String> iterator2 = orderedset.iterator();
		while(iterator2.hasNext()) {
			String next = iterator2.next();
			System.out.println(next);
		}
		//using foreach
		for(String elem:set) {
			System.out.println("using foreach" + elem);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
