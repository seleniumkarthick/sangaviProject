package com.test.java.basics;

public class FinalKeywordSample {
	
	final int x=10;
	
	public void m1(){
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		FinalKeywordSample obj=new FinalKeywordSample();
		obj.m1();
	}

}
