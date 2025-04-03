package com.practice.java.code.samples.javafundmentals;

public class WrapperClasses {

	public static void main(String[] args) {
		
		//Demonstrates the usage of wrapper classes like Integer, Double, Character, 
		//and Boolean to store the student's ID, score, grade, and active status.
		
		int studentId = 102;
		Integer obj = studentId;
		Double studentScore = 96.4;
		Character grade = 'A';
		Boolean isActive = true;
		
		System.out.println("Student ID (Wrapper): " +studentId );
		System.out.println("Student Score: " +studentScore);
		System.out.println("Grade: " +grade);
		System.out.println("Active Status: " +isActive);

	}

}
