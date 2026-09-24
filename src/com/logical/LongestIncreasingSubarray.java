package com.logical;

import java.util.Scanner;

public class LongestIncreasingSubarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Invalid array size.");
            sc.close();
            return;
        }

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int currentLength = 1;
        int longestLength = 1;

        for (int i = 1; i < size; i++) {

            if (numbers[i] > numbers[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            if (currentLength > longestLength) {
                longestLength = currentLength;
            }
        }

        System.out.println(
                "Longest Increasing Subarray Length: " + longestLength
        );

        sc.close();
    }
}
