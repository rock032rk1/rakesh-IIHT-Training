package com.oops.demo.assignment;
@FunctionalInterface
interface Shape{
	
	void draw();
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		Shape shape=()->System.out.println("I am Rectangle..");
		
		shape.draw();
	}
}
