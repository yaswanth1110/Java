package com.flm.core;

public class Test {

	public static void main(String[] args) {
		//Nagarjuna n1 = new Nagarjuna(12.1,123);
		
		Nagarjuna c = new Chaitanya(100.123,1200);
		//c.setCode(100);
		//c.setSalary(1200.45);
		System.out.println("Code : "+c.getCode()+" , Salary : "+c.getSalary());
		c.display();
		c.hello();
		
	}

}
