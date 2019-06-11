package com.test.java.basics;

public class StringSample {
	
	public static void main(String[] args) {
		
		String x="hai hello how are you";
		
		//length
		x.length();
		
		if(x.equals("hai Hello how are you")){
			System.out.println("pass");
		}else{
			System.out.println("fail");
		}
		

		if(x.equalsIgnoreCase("hai Hello how are you")){
			System.out.println("pass");
		}else{
			System.out.println("fail");
		}
		
		System.out.println(x.toUpperCase());
		
	}

}
