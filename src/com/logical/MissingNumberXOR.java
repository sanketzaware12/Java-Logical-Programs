package com.logical;

import java.util.Scanner;

public class MissingNumberXOR {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] numbers = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int xor = 0;

        // XOR of numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor = xor ^ i;
        }

        // XOR with array elements
        for (int number : numbers) {
            xor = xor ^ number;
        }

        System.out.println("Missing Number: " + xor);

        sc.close();
    }

}
