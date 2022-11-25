package com.oops.demo.assignment;

class Fruit{
	
	void fruits() {
		
		System.out.println("I am a Fruit.");
	}
}

class Apple extends Fruit{
	
	void apple() {
		System.out.println("I am a Apple");
	}
}

public class InheritenceDemo {

	public static void main(String[] args) {
		
		Apple apl=new Apple();
		
		apl.fruits();
		apl.apple();
		
	}
}
