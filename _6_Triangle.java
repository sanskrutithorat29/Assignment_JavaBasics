package com.javaBasicAssignment;

import java.util.Scanner;

public class _6_Triangle {

	public static void main(String[] args) {
		/*
		 * Write a Java program to print the area of a traingle
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the breadth of triangle: ");
		double breadth = sc.nextDouble();
		System.out.println("Enter the height of triangle: ");
		double height = sc.nextDouble();

		double area = 0.5 * breadth * height;
		System.out.println("The area of triangle is: " + area);
		sc.close();
	}

}
