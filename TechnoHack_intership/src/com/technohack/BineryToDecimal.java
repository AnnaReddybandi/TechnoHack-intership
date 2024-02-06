package com.technohack;

import java.util.Random;
import java.util.Scanner;

public class BineryToDecimal {

	public static void main(String[] args) {
		
		//  Create a Random object to generate random numbers
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Simulate rolling a pair of dice
        int die1 = random.nextInt(6) + 1; // Generates a random number between 1 and 6
        int die2 = random.nextInt(6) + 1;

        // Calculate the total sum of the dice
        int sum = die1 + die2;

        // Display the result in decimal form
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total: " + sum);

        // Prompt user for a binary number
        System.out.print("Enter a binary number: ");
        String binaryInput = scanner.nextLine();

        // Convert binary to decimal
        int decimalResult = binaryToDecimal(binaryInput);
        System.out.println("Decimal representation of " + binaryInput + ": " + decimalResult);

        // Prompt user for a decimal number
        System.out.print("Enter a decimal number: ");
        int decimalInput = scanner.nextInt();

        // Convert decimal to binary
        String binaryResult = decimalToBinary(decimalInput);
        System.out.println("Binary representation of " + decimalInput + ": " + binaryResult);
    }

    // Function to convert binary to decimal
    private static int binaryToDecimal(String binary) {
        int decimal = 0;
        int binaryLength = binary.length();

        for (int i = 0; i < binaryLength; i++) {
            int digit = binary.charAt(i) - '0';
            decimal += digit * Math.pow(2, binaryLength - 1 - i);
        }

        return decimal;
    }

    // Function to convert decimal to binary
    private static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
	}

}
