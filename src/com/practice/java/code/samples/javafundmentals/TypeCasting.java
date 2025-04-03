package com.practice.java.code.samples.javafundmentals;

public class TypeCasting {

	public static void main(String[] args) {
		//Demonstrates explicit type casting by converting a student's score 
		//from a double type to an int type.
		
		//implicit auto
		int studentId = 101;
		
		double decimalStudentId = studentId;
		
		//explicit manual
		double studentScore = 97.8;
		
		int roundedScore = (int) studentScore;
		
		System.out.println("Original Student ID (int) : " + studentId);
		System.out.println("Rounded Student ID (double) : " + decimalStudentId);
		
		System.out.println("Original Score (double) : " + studentScore);
		System.out.println("Rounded Score (int) : " + roundedScore);

	}

}
