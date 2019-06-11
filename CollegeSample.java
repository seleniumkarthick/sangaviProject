package com.test.java.basics;

public class CollegeSample {
	
	
	public void mca(int tamil,int english){
		int total=tamil+english;
		System.out.println(total);
		
		int avg=total/2;
		
		if(avg>50){
			System.out.println("grade a");
		}else if(avg>50 && avg<70){
			System.out.println("grade b");
		}else{
			System.out.println("fail");
		}
		
	}

	public static void main(String[] args) {
		CollegeSample stud1=new CollegeSample();
		stud1.mca(10,20);
	}
	
}
