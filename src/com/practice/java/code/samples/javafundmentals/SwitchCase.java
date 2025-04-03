package com.practice.java.code.samples.javafundmentals;

public class SwitchCase {
	
	//Switch-Case	When you have multiple fixed values to compare.
	//Switch-Case	"If it's Monday, go to work. If it's Saturday, relax."

	public static void main(String[] args) {
		int day = 2;
		switch (day) {
	    case 1: System.out.println("Monday"); break;
	    case 2: System.out.println("Tuesday"); break;
	    default: System.out.println("Invalid day");
	}

	}

}
