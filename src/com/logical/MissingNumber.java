package com.logical;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] numbers = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int number : numbers) {
            actualSum = actualSum + number;
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing Number: " + missingNumber);

        sc.close();
    }	

}
