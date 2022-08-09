package com.java.collectionInterfaces;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
	ArrayList <Integer> mylist = new ArrayList<>(100);
	for(int i =0; i <10; i++) {
		mylist.add(i);         //Autobox i
	}
	System.out.println(mylist); 
	//System.out.println(mylist.size());
	//System.out.println(mylist.indexOf(50));
	//System.out.println(mylist.contains(5));
	boolean success =  mylist.remove((Integer)8);
	System.out.println(success);
	System.out.println( mylist.remove(8));
	System.out.println(mylist); 
	Integer max = Integer.MIN_VALUE; 
	for(int i = 0; i<mylist.size(); i++) {
		if(mylist.get(i)> max) max = mylist.get(i);
	}
	System.out.println("max is :" + max);
	mylist.set(0, 8); //use set
	System.out.println(mylist.get(0)); 
	
	for(Integer num : mylist) {
		System.out.println(num);
	}
	}
	

}
