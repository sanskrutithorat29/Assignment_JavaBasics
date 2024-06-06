package com.javaBasicAssignment;

import java.util.Scanner;

public class _15_BasicCalculator {

	public static void main(String[] args) {
		/*
		 * Write a Java program to perform basic Calculator operations.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();

		System.out.println("Enter which operation you want to perform");
		System.out.println("\n1.Addition (+)");
		System.out.println("\n2.Substraction (-)");
		System.out.println("\n3.Multiplication (x)");
		System.out.println("\n4.Division (/)");
		System.out.println("\n5.Modulus (%)");

		System.out.println("Enter the number of choice:");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Addition is: " + (num1 + num2));
			break;

		case 2:
			System.out.println("Substraction is: " + (num1 - num2));
			break;

		case 3:
			System.out.println("Multiplication is: " + (num1 * num2));
			break;

		case 4:
			try {
				System.out.println("Division is: " + (num1 / num2));

			} catch (ArithmeticException e) {
				System.out.println("Cannot be divided by 0");
			}
			break;

		case 5:
			try {
				System.out.println("Modulus is: " + (num1 % num2));

			} catch (ArithmeticException e) {
				System.out.println("Cannot be divided by 0");
			}
			break;

		default:
			System.out.println("Please enter valid input");
			break;
		}
		sc.close();

	}

}
