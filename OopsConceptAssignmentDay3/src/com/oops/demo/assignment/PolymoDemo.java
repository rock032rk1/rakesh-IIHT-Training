package com.oops.demo.assignment;

class Bank{
	
	void rateOfInterest() {
		System.out.println("Bank provide higher rate of interest");
	}
}

class Sbi extends Bank{
	
	void rateOfInterest() {
		System.out.println("SBI Bank provide higher rate of interest");
	}
}

class BankOfIndia extends Bank{
	
	void rateOfInterest() {
		System.out.println("BankOfIndia provide higher rate of interest");
	}
}

public class PolymoDemo {

	public static void main(String[] args) {
		
		Bank sb=new Sbi();
		Bank boi=new BankOfIndia();
		
		sb.rateOfInterest();
		boi.rateOfInterest();
	}
}
