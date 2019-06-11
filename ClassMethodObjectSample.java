package com.test.java.basics;

public class ClassMethodObjectSample {
	
	//method without parameter
	public void m1(){
		System.out.println("1111111111");
	}
	
	//method with parameters
	public void m2(int x,int y){
		int z=x+y;
		System.out.println(z);
		if(z==10){
			System.out.println("fail");
		}else{
			System.out.println("pass");
		}
	}

	//method with return type
	public int m3(int x1,int y1){
		int z1=x1+y1;
		return z1;
	}
	
	
	public static void main(String[] args) {
		//classname obj=new classname();
		ClassMethodObjectSample obj=new ClassMethodObjectSample();
		obj.m1();
		obj.m2(10, 20);
		obj.m2(234234, 234324);
		
		int c=obj.m3(20,30);
		System.out.println(c);
		
		if(c==10){
			System.out.println("fail");
		}else{
			System.out.println("pass");
		}
		
		int c1=obj.m3(200,30);
		System.out.println(c);
		
		if(c1==10){
			System.out.println("fail");
		}else{
			System.out.println("pass");
		}
		
		
		
	}
}
