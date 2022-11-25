package com.oops.demo.assignment;

interface Animal{
	
	void sound();
}

class Tiger implements Animal{

	@Override
	public void sound() {
		
		System.out.println("Tiger is roar..");
	}
	
}

class Cat implements Animal{

	@Override
	public void sound() {
		
		System.out.println("Cat is mau mau..");
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		Animal tt=new Tiger();
		Animal ct=new Cat();
		
		tt.sound();
		ct.sound();
	}

}
