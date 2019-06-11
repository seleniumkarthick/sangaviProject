package com.test.java.basics;

public class ConstructorSample {
	
	/*
	 * class name method name are same 
	 * it will not have return
	 * no need to create object to call constructor
	 * constructor will run first
	 */
	
	
	public ConstructorSample(){
		System.out.println("1111111");
	}
	
	public static void main(String[] args) {
		new ConstructorSample();
	}

}
