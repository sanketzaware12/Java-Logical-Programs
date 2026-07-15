package com.logical;

import java.util.Scanner;

public class FindMissingNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] numbers = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int missingNumber = 1;

        for (int i = 1; i <= n; i++) {

            boolean found = false;

            for (int j = 0; j < numbers.length; j++) {

                if (i == numbers[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                missingNumber = i;
                break;
            }
        }

        System.out.println("Missing Number: " + missingNumber);

        sc.close();
    }
}