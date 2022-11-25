package com.inhetance.demo.project;

abstract class Animal {

	public abstract void nameA();

	public void info() {

		System.out.println("I am Animal");
	}
}

class Tiger extends Animal {

	public void sound() {

		System.out.println("Tiger is roar");
	}

	@Override
	public void nameA() {

		System.out.println("I am Tiger");

	}
}

public class ABC {

	public static void main(String[] args) {

		Tiger t = new Tiger();
		t.nameA();
		t.info();
		t.sound();
	}
}
