package com.inhetance.demo.project;

class Animals {

	public void sound() {

		System.out.println("Animals Sound");
	}
}

class Birds extends Animals {

	public void sound() {

		System.out.println("Birds Sound");
	}
}

class Dog extends Animals {

	public void sound() {

		System.out.println("Dogs Sound");
	}
}

public class Poly {

	public static void main(String[] args) {

		Animals an = new Animals();
		Animals bd = new Birds();
		Animals dg = new Dog();

		an.sound();
		bd.sound();
		dg.sound();

	}
}
