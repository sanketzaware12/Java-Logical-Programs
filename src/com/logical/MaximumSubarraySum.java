package com.logical;

import java.util.Scanner;

public class MaximumSubarraySum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int currentSum = numbers[0];
        int maxSum = numbers[0];

        for (int i = 1; i < size; i++) {

            currentSum = Math.max(numbers[i],
                    currentSum + numbers[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);

        sc.close();
    }
}