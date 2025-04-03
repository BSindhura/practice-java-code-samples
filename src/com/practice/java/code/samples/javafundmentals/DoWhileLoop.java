package com.practice.java.code.samples.javafundmentals;

import java.util.Scanner;

public class DoWhileLoop {
	
	//Do-While Loop	When you need to execute at least once.
	//Do-While	"At least greet a guest once, then decide to talk more."

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Create Scanner object
		int num;
		do {
		    System.out.println("Enter a positive number:");
		    num = scanner.nextInt();
		} while (num <= 0);
		
		scanner.close();

	}

}
