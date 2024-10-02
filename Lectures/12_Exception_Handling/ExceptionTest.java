package com.flm.core;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 43929384 ;
		int c = 0;
		try {
			c = a/b;
		}catch(NullPointerException | ArrayIndexOutOfBoundsException abc) {
			System.out.println(abc.getMessage());
		}catch(Throwable abc) {
			System.out.println(abc.getMessage());
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
