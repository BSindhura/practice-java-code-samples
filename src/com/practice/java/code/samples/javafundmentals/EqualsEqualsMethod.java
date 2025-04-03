package com.practice.java.code.samples.javafundmentals;

public class EqualsEqualsMethod {

	public static void main(String[] args) {
		//compare using integers
		int a = 10;
		int b = 10;
		System.out.println("a == b: " +(a == b));
		
		//compare using string
		String str1 = "Hello";
		String str2 = new String("Hello");
		System.out.println("str1 == str2: " + (str1 == str2));
		System.out.println("str1.equals(str2): " + str1.equals(str2));

	}

}
