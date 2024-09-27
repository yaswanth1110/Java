package com.flm.core;

public class Test {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		Employee.code=234;
		Employee.display();
		System.out.println(emp.getCode());
		
		
		Student s1 = new Student();
		s1.setName("Ravi");s1.setPhoneNumber("12345678");s1.setAddress("Hyderabad");
		System.out.println(s1.getAddress());
		Student s2 = new Student();
		s2.setName("Ravi");s2.setPhoneNumber("12345678");s2.setAddress("Vijayawada");
		System.out.println(s2.getAddress());
		Student s3 = new Student();
		s3.setName("Ravi");s3.setPhoneNumber("12345678");s3.setAddress("Guntur");
		System.out.println(s3.getAddress());
	}

}
