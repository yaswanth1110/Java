package com.flm.core;

public class Employee {
	static int code;
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
	public Employee() {
		super();
	}
	public Employee(int code, double salary) {
		super();
		this.code = code;
		this.salary = salary;
	}
	
	public static void display() {
		System.out.println("Hello");
	}
}
