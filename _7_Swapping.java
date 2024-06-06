package com.javaBasicAssignment;

import java.util.Scanner;

public class _7_Swapping {

	public static void main(String[] args) {
		/*
		 * Write a Java program to swap two variables.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();

		System.out.println("Using third variable");
		System.out.println("Before swapping: " + num1 + " and " + num2);
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swapping: " + num1 + " and " + num2);

		System.out.println("---------------------------------------");

		System.out.println("Without using third variable");
		System.out.println("Before swapping: " + num1 + " and " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After swapping: " + num1 + " and " + num2);
		sc.close();
	}

}
