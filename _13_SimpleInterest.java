package com.javaBasicAssignment;

import java.util.Scanner;

public class _13_SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal: ");
		double principal = sc.nextDouble();

		System.out.println("Enter the rate: ");
		double rate = sc.nextDouble();

		System.out.println("Enter the time in months: ");
		double time = sc.nextDouble();

		double simple_interest = (principal * rate * time) / 100;
		System.out.println("The simple interest is: " + simple_interest);

		sc.close();
	}

}
