package com.javaBasicAssignment;
import java.util.Scanner;
public class _12_LeapYear {

	public static void main(String[] args) {
		/*
		 * Write a Java program that 
		 * takes a year from the user and prints whether it is
		 * a leap year or not.
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year=sc.nextInt();
		if(year%4==0)
		{
			System.out.println(year+" is leap year");
		}
		else
		{
			System.out.println(year+" is not an leap year");
		}
		sc.close();
	}

}
