package com.java8.demo.projects;

interface MultiTest{
	
	int multi(int i,int j);
}

public class MultiDemo {

	public static void main(String[] args) {
		
		MultiTest val=(i,j)->i*j;
		
		System.out.println(val.multi(3, 5));
	}
}
