package com.test.java.basics;

public class ExceptionHandlingSample {
	
	public static void main(String[] args) throws Exception{
		

		Thread.sleep(3000);
		
		try{
			int x=10/0;
			System.out.println(x);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		try{
			int x[]={10,20,30};
			System.out.println(x[3]);
		}catch(ArithmeticException e1){
			e1.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e2){
			e2.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("11111111111");
		
		
		try{
			int x=10/0;
			System.out.println(x);
		}finally{
			System.out.println("22222222");
		}

		System.out.println("end");
		
		
	}

}
