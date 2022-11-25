package com.java8.demo.projects;

interface SumDemo{
	
	int sum(int i,int j);
}

public class JavaSum {

	public static void main(String[] args) {
		
		SumDemo sum=(int i, int j) ->i+j;
			
		System.out.println(sum.sum(10, 5));
	}
}
