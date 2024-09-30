package com.flm.core;

public class StringBufferTest {

	public static void main(String[] args) {
		/*
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		System.out.println(sb);
		sb.append(" World");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		String result = sb.toString();
		System.out.println(result.toUpperCase());
		*/
		/*
		StringBuffer sb = new StringBuffer("ABC");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		*/
		/*
		String str = "Hello WQorld...";
		char[] chars = str.toCharArray();
		System.out.println();
		*/
		StringBuffer str = new StringBuffer("Hello");
		for(int i=1;i<=50;i++)
			str.append(i);
		System.out.println(str);
		str.delete(0, str.length());
		System.out.println("-------------------------");
		System.out.println(str.length());
		String str1 = "Hello";
		String s = str1.replaceAll("ll", "ABC");
		System.out.println(s);
	}

}
