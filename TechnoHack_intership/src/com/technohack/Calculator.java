package com.technohack;

import java.util.Scanner;

public class Calculator {

	public static double add(double x, double y) {
		return x + y;
	}
	public static double sub(double x, double y) {
		return x - y;
	}
	public static double mul(double x, double y) {
		return x * y;
	}
	public static double div(double x, double y) {
		if (y != 0) {
			return x / y;
		} else {
			System.out.println("it is not divisible");
			return Double.NaN; 
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Option");
		System.out.println("1. Addition");
		System.out.println("2. Substration");
		System.out.println("3. multiplication");
		System.out.println("4. division");

		System.out.println("enter your choice 1/2/3/4 :");
		char choice = sc.next().charAt(0);

		System.out.println("enter num1 :");
		double first = sc.nextDouble();

		System.out.println("enter num2 :");
		double second = sc.nextDouble();

		double result = 0;
		switch (choice) {
		case '1':
			result = add(first, second);
			System.out.println("Addition : " +first+ " + " + second+" = "+result);
			break;
		case '2':
			result = sub(first, second);
			System.out.println("Substration : " +first+ " - " + second+" = "+result);
			break;
		case '3':
			result = mul(first, second);
			System.out.println("Multiplication : " +first+ " * " + second+" = "+result);
			break;
		case '4':
			result = div(first, second);
			System.out.println("Division : " +first+ " / " + second+" = "+result);
			break;
		default:
			System.out.println("not found result");
		}

	}

}
