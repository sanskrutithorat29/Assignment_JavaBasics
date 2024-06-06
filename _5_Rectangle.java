package com.javaBasicAssignment;

import java.util.Scanner;

public class _5_Rectangle {

	public static void main(String[] args) {
		/*
		 * Write a Java program to print the area and perimeter of a rectangle
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the width of rectangle: ");
		double width = sc.nextDouble();
		System.out.println("Enter the length of rectange: ");
		double length = sc.nextDouble();

		// area
		double area = width*length;
		System.out.println("The area of rectangle is: " + area);

		// perimeter
		double peri = 2 *(length+width);
		System.out.println("The perimeter of rectangle is: " + peri);
		sc.close();
	}

}
