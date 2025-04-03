package com.practice.java.code.samples.javafundmentals;

public class BreakContinuesStmt {
	
	//Break	When you need to stop a loop early.
	//Continue	When you need to skip an iteration and continue.
	//Break	"Stop eating when you feel full."
	//Continue	"Skip the TV ads but keep watching the show."

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
		    if (i == 3) {
		        break;  // Stops when i is 3
		    }
		    System.out.println(i);
		}
		for (int j = 1; j <= 5; j++) {
		    if (j % 2 == 0) {
		        continue;  // Skips even numbers
		    }
		    System.out.println(j);
		}

	}

}
