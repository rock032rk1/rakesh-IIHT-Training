package com.inhetance.demo.project;

class Vehical{
	
	String brand="Tata";
	
	public void display() {
		
		System.out.println("Welcome to Tata");
	}
}



public class Car extends Vehical{

	public static void main(String[] args) {
		
		String model="Nexon";
		Car c=new Car();
		c.display();
	}
}
