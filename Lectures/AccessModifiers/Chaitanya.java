package com.flm.core;

public class Chaitanya extends Nagarjuna{
	
	public Chaitanya() {
		
	}
	public Chaitanya(int code , double salary) {
		super(salary,code);
	}
	public Chaitanya(double salary, int code) {
		super(salary,code);
		System.out.println("Hello");
	}
	public void display() {
		System.out.println("I am from Chaitanya...");
	}
	
	public void hello() {
		System.out.println("Hello from Chaitanya...");
	}
	public void display(double salary, int code) {
		//super(salary,code);
		System.out.println("I am from Chaitanya...");
	}
}
