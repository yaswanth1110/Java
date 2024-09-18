package com.flm.core;

public class Student {
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
	public Student(int code, double salary) {
		System.out.println("code,salary is executed...");
		this.code = code;
		this.salary = salary;
	}
	public Student(double salary, int code) {
		System.out.println("salary,code is executed...");
		this.code = code;
		this.salary = salary;
	}
	public Student() {}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void display() {
		System.out.println("Hello world...");
	}
	public void display(int code) {
		System.out.println("Code : "+code);
	}
	public void display(double salary) {
		System.out.println("Salary : "+salary);
	}
}
