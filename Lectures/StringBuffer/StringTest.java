package com.flm.core;

public class StringTest {

	public static void main(String[] args) {
		String str = "Hello World";
		String str1 = "Hello World";
		String s1 = str.concat(" How are you ?");
		System.out.println(s1);
		System.out.println(s1.contains("you"));
		System.out.println(str.contains("you"));
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.startsWith("hell"));
		System.out.println(str.isEmpty());
		System.out.println(str.substring(6,9));
		String[] names = str.split(" ");
		for(int i=0;i<names.length;i++)
			System.out.println(names[i]);
	}
}
