package com.flm.core;

public class Student {
	private int code;
	private double salary;
	
	public Student(){
		code=-1;
		salary=-500;
	}
	public Student(int a, double b){
		code=a;
		salary=b;
	}
	public Student(int a, int b){
		code=a;
		salary=(double)b;
	}
	public Student(double a, double b){
		code=(int)a;
		salary=b;
	}
	public Student(double b, int a){
		code=a;
		salary=b;
	}
	public Student(double b){
		salary=b;
	}
	public Student(int a){
		code=a;
	}
	public void setCode(int a) {
		code = a;
	}
	public int getCode() {
		return code;
	}
	
	public void setSalary(double b) {
		salary = b;
	}
	
	public double getSalary() {
		return salary;
	}
	
}
