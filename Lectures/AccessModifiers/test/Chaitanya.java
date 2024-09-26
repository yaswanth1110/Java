package com.flm.core.test;

import com.flm.core.Nagarjuna;

public class Chaitanya extends Nagarjuna{
	
	private int regNum;
	
	public Chaitanya() {
		super();
	}
	public Chaitanya(int code , double salary) {
		//super(code,salary);
		//super();
		//setCode(code);
		//setSalary(salary);
		this.code=code;
		this.salary=salary;
		System.out.println("I am in Chaitanya constructor");
	}
	public Chaitanya(double salary, int code) {
		//super(code,salary);
		setCode(code);
		setSalary(salary);
		System.out.println("I am in Chaitanya constructor");
		super.display();
	}
	
	public void hello() {
		super.hello();
		System.out.println("Hello from Chaitanya...");
	}
	public void display() {
		super.display();
		super.setCode(100);
		super.setSalary(100.25);
		super.getClass();
		super.getSalary();
		super.code=1200;
		System.out.println("I am from Chaitanya...");
	}
	
	public int getCode() {
		return code;
	}
}
