package com.inhetance.demo.project;

class Person {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Encaps {

	public static void main(String[] args) {

		Person p = new Person();
		p.setName("Ramesh");

		System.out.println("My Name is : " + p.getName());
	}
}
