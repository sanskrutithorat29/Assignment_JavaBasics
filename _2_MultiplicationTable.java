package com.javaBasicAssignment;

import java.util.Scanner;

public class _2_MultiplicationTable {

	public static void main(String[] args) {
		/*
		 * Write a Java program that takes a number as input and prints its
		 * multiplication table up to 10.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of which you want table: ");
		int num = sc.nextInt();

		// using for loop
		// System.out.println("Using for loop");
		for (int i = 1; i <= 10; i++) {
			int multi = num * i;
			System.out.println(num + "x" + i + "=" + multi);
		}
		System.out.println("---------------------------------------");
		System.out.println("Using while loop");
		// using whileloop
		int j = 1;
		while (j <= 10) {
			int x = num * j;
			System.out.println(num + "x" + j + "=" + x);
			j++;
		}
		sc.close();
	}

}
