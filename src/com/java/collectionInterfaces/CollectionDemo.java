package com.java.collectionInterfaces;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection<String> fruitCollection = new ArrayList<>();
		fruitCollection.add("banana");
		fruitCollection.add("banana");
		fruitCollection.add("banana");
		fruitCollection.add("banana");
		fruitCollection.remove("banana");
		System.out.println(fruitCollection);
		System.out.println(fruitCollection.contains("apple"));

	}

}
