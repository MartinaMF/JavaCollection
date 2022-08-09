package com.martina.module;

public class TheWrapperTest {

	public static void main(String[] args) {
		//Integer object
		TheWrapper<Integer> iobj = new TheWrapper<>(7);
		System.out.println(iobj.getValue());
		//String object
		TheWrapper<String> sobj = new TheWrapper<>("martina");
		System.out.println(sobj.getValue());
	}

}
