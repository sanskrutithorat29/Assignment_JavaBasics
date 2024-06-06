package com.javaBasicAssignment;

import java.util.Scanner;

public class _4_Average {

	public static void main(String[] args) {
		/*
		 * Write a Java program that takes three numbers as input to calculate and print
		 * the average of the numbers.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double num1 = sc.nextDouble();
		System.out.println("Enter second number: ");
		double num2 = sc.nextDouble();
		System.out.println("Enter third number: ");
		double num3 = sc.nextDouble();

		double avg = (num1 + num2 + num3) / 3;
		System.out.println("The average is: " + avg);
		sc.close();
	}

}
