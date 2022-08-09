package com.java.collectionInterfaces;

import java.util.HashMap;
import java.util.Map;

public class HashMapTextBookTest {

	public static void main(String[] args) {
		HashMapTextBook textBookMap = new HashMapTextBook();
		HashMap<Integer,String> textBooks = new HashMap<>();
		textBooks.put(1, "Java programming");
		textBooks.put(2, " Python Programming");
		textBooks.put(3, " C++ Programming");
		textBooks.put(4, "Xcode Programming");
		
		textBookMap.displayMap(textBooks);
		System.out.println();
		textBooks.remove(1);
		textBookMap.displayMap(textBooks);
	}

}
