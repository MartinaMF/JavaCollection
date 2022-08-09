package com.java.collectionInterfaces;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HashMapWordCount {
 public void createWordMap(Map<String, Integer> word_map) {
	 Scanner input = new Scanner(System.in);
	 System.out.println("plz enter a string : ");
	 String entry = input.nextLine();
	 
	 //Tokenize the user entry 
	 String[] tokens = entry.split(" ");
	 //Process entered input by the user
	 for(String token:tokens) {
		 String word = token.toLowerCase();
		 if(word_map.containsKey(word)) { //is the char in the word_map
			 int count = word_map.get(word);
			 word_map.put(word, count+1);
			 
		 }
		 else {
			 word_map.put(word, 2);//add new word with a count of 2 to map
		 }
	 }
 }
 public void displayMap(Map<String, Integer> word_map) {
	 Set<String> keys = word_map.keySet();
	 //sort all keys using TreeSet
	 TreeSet<String> sortedKeys = new TreeSet<>(keys);
	 System.out.println("Map contains\nkey\tValue\n");
	 //generate output for each key in the map
	 for(String key:sortedKeys) {
		 System.out.println(key + "\t" + word_map.get(key));
	 }
	 System.out.println("Map size : " + word_map.size() + "\nIs the map empty :" +word_map.isEmpty());
 }
}
