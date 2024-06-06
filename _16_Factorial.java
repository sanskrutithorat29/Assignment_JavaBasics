package com.javaBasicAssignment;

import java.util.Scanner;

public class _16_Factorial {

	public static void main(String[] args) {
		/*
		 * Write a simple Java program to calculate a Factorial of a number.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int fact = 1;
		while (num >= 1) {
			fact = fact * num;
			num--;
		}
		System.out.println("The factorial is: " + fact);
		sc.close();
	}

}
