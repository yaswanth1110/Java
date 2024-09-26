package com.flm.core;

public class Nagarjuna extends Object{
	protected int code;
	protected double salary;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Nagarjuna() {
		code=5;
		salary=100.35;
	}
	public Nagarjuna(int code, double salary) {
		this.code = code;
		this.salary = salary;
		System.out.println("I am in Nagarjuna constructor int, double");
	}
	public Nagarjuna(double salary,int code) {
		this.code = code;
		this.salary = salary;
		System.out.println("I am in Nagarjuna constructor double,int");
	}
	public void display() {
		System.out.println("I am from Nagarjuna...");
	}
	
	public void hello() {
		System.out.println("Hello from Nagarjuna...");
	}
}
