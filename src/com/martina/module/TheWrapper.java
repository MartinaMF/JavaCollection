package com.martina.module;

public class TheWrapper <T>{
	private T t;
	private  int accessTCount; //object share
	//costructor
	public TheWrapper(T t){
	this.t = t;
	}
	public T getValue() {
		accessTCount++;
		System.out.println(accessTCount);
		return t;
	}
}
