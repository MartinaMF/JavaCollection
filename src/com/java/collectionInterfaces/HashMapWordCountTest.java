package com.java.collectionInterfaces;

import java.util.HashMap;
import java.util.Map;

public class HashMapWordCountTest {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		HashMapWordCount wordmap = new HashMapWordCount();
		wordmap.createWordMap(map);
		wordmap.displayMap(map);
	}

}
