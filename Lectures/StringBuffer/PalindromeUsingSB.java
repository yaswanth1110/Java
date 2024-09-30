package com.flm.core;

public class PalendrumUsingSB {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("aBAA");
		String response = str.toString();
		str.reverse().toString();
		System.out.println(response);
		System.out.println(str);
		if (response.equals(str.toString()))
			System.out.println("It is Palendrome");
		else
			System.out.println("It is not Palendrome");
	}
}
