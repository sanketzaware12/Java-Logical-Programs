package com.logical;

import java.util.Scanner;

public class MaximumConsecutiveOnes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " elements (only 0 or 1):");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int currentCount = 0;
        int maxCount = 0;

        for (int number : numbers) {

            if (number == 1) {

                currentCount++;

                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }

            } else {

                currentCount = 0;
            }
        }

        System.out.println("Maximum Consecutive 1s: " + maxCount);

        sc.close();
    }
}