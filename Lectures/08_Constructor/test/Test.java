package com.flm.core.test;

import com.flm.core.Student;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student(100,1200.25);
		//s1.setCode(200);
		//s1.setSalary(4000.45);
		System.out.println(s1.getCode()+"-->"+s1.getSalary());
		s1.display();
		s1.display(1200.12);
		s1.display(500);
	}

}
