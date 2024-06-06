package com.javaBasicAssignment;

import java.util.Scanner;

public class _10_GreatestNumber {

	public static void main(String[] args) {
		/*
		 * Write a Java program that takes three numbers from the user and prints the
		 * greatest number.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter third number: ");
		int num3 = sc.nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is greatest number");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is greatest number");
		} else if (num3 > num1 && num3 > num1) {
			System.out.println(num3 + " is greatest number");
		} else {
			System.out.println("Please enter valid input");
		}
		sc.close();
	}

}
