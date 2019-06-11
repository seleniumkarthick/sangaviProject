package com.test.java.basics;

public class StaticKeywordSample {
	
	static int x=10;
	
	public StaticKeywordSample(){
		x++;
		System.out.println(x);
	}
	
	public static void m1(){
		System.out.println("hai hello");
	}
	
	public static void main(String[] args) {
		new StaticKeywordSample();
		new StaticKeywordSample();
		new StaticKeywordSample();
		new StaticKeywordSample();
		
		StaticKeywordSample.m1();
	}

}
