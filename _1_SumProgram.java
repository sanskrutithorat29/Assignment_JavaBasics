package com.javaBasicAssignment;

import java.util.Scanner;

public class _1_SumProgram {

	public static void main(String[] args) {
		/*
		 * Write a Java program that takes two values as input and displays the sum of
		 * two numbers
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		System.out.println("The sum is: " + (num1 + num2));
		sc.close();
	}

}
