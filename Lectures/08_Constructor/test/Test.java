package com.flm.core.test;

import com.flm.core.Student;

public class Test {

	public static void main(String[] args) {
		Student st = new Student(12,1.2);
		//st.setCode(123);
		//st.setSalary(1200.25);
		System.out.println(st.getCode());
		System.out.println(st.getSalary());
	}

}
