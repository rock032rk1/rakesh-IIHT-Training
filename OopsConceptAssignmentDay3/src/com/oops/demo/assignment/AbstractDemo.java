package com.oops.demo.assignment;

abstract class Vehical{
	
	abstract void model();
		
}

class Tata extends Vehical{

	@Override
	void model() {
		
		System.out.println("Tata Model");
	}
		
}

class Maruti extends Vehical{

	@Override
	void model() {
		
		System.out.println("Maruti Model");
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		
		Vehical tt=new Tata();
		Vehical mr=new Maruti();
		
		tt.model();
		mr.model();
	}
}
