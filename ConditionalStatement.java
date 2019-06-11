package com.test.java.basics;

public class ConditionalStatement {
	
	public static void main(String[] args) {
		
		/*
		 * if
		 * if...else
		 * if..else if...else
		 * switch
		 */
		int x=10;
		
		if(x==10){
			System.out.println("pass");
		}
		
		
		if(x==11){
			System.out.println("pass");
		}else{
			System.out.println("fail");
		}
		
		
		if(x==11){
			System.out.println("1111");
		}else if(x==10){
			System.out.println("222222222");
		}else{
			System.out.println("33333333");
		}
		
		char x1='b';
		
		switch(x1){
		
		case 'a':
			System.out.println("111111111");
			break;
			
		case 'b':
			System.out.println("2222222222");
			break;
		
		default:
			System.out.println("33333");
			
		}
		
		
		
		
		
		
	}

}
