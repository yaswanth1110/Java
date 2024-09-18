package com.flm.core;

public class Test {

	public static void main(String[] args) {
		Student st = new Student();
		//st.num = 100; //Dont assign the values like this in OOPL
		st.setValue(200);
		System.out.println(st.getValue());
		Employee emp = new Employee();
		Department dept = new Department();
	}
}
