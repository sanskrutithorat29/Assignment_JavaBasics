package com.javaBasicAssignment;

import java.util.Scanner;

public class _14_QuotientAndRemainder {

	public static void main(String[] args) {
		/*
		 * Write a Java program to Find Quotient and Remainder for a given number.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the divident: ");
		int divident = sc.nextInt();

		System.out.println("Enter the divisor: ");
		int divisor = sc.nextInt();

		int quotient = divident / divisor;
		System.out.println("The quotient is: " + quotient);

		int remainder = divident % divisor;
		System.out.println("The remainder is: " + remainder);

		sc.close();
	}

}
