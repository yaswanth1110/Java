package com.flm.core;

public class Nagarjuna {
	private int code;
	private double salary;
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
	
	}
	public Nagarjuna(int code, double salary) {
		this.code = code;
		this.salary = salary;
	}
	public Nagarjuna(double salary,int code) {
		this.code = code;
		this.salary = salary;
	}
	public void display() {
		System.out.println("I am from Nagarjuna...");
	}
	
	public void hello() {
		System.out.println("Hello from Nagarjuna...");
	}
}
