package com.javaBasicAssignment;

import java.util.Scanner;

public class _3_Circle {

	public static void main(String[] args) {
		/*
		 * Write a Java program to print the area and perimeter of a circle.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		double radius = sc.nextDouble();

		// area
		double area = 3.14159 * radius * radius;
		System.out.println("The area of circle is: " + area);

		// perimeter
		double peri = 2 * 3.14159 * radius;
		System.out.println("The perimeter of circle is: " + peri);
		sc.close();
	}

}
