package com.javaBasicAssignment;

import java.util.Scanner;

public class _8_InchesToMeter {

	public static void main(String[] args) {
		/*
		 * Write a Java program that reads a number in inches and converts it to meters.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many inches: ");
		double inch = sc.nextDouble();

		double meter = 0.0254 * inch;
		System.out.println("In meter: " + meter);
		sc.close();
	}

}
