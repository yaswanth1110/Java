package com.flm.core;

public class Palendrum {

	public static void main(String[] args) {
		String str = "aBA";
		String response = "";
		for(int i=str.length()-1;i>=0;i--) {
			char c = str.charAt(i);
			response += String.valueOf(c);
		}
		if (str.equalsIgnoreCase(response))
			System.out.println("It is Palendrome");
		else
			System.out.println("It is not Palendrome");
	}
}
