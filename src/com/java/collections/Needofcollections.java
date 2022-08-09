package com.java.collections;

public class Needofcollections {

	public static void main(String[] args) {
		class Book{
			
		}
		class Student{
			
		}
		//limitation of an Array 
		//1. fixed in size
		//2. can hold only homogeneous data elements
		
		
		Student [] studentArray = new Student[10];
		studentArray[0] = new Student();
		studentArray[1] = new Student();
		//studentArray[2] = new Book();
		// use Object data type to solve only homogeneous limitation
		Object [] obj = new Object[10];
		obj[0] = new Object();
		obj[1] = new Object();
		obj[2] = new Object();
		
		//3. Array doesnt provide any ready made API or methods to work with data structure and Algorithm
		//so we need all collection framework to solve limitation of Array

	}

}
