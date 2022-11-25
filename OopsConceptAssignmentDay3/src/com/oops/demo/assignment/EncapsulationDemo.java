package com.oops.demo.assignment;

class Person {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class EncapsulationDemo {

	public static void main(String[] args) {

		Person ps = new Person();

		ps.setName("Nobita");
		ps.setAge(32);

		System.out.println("Name : " + ps.getName());
		System.out.println("Age  : " + ps.getAge());
	}
}
