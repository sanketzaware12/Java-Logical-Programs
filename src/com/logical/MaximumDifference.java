package com.logical;

import java.util.Scanner;

public class MaximumDifference {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        if (size < 2) {
            System.out.println("Array must contain at least 2 elements.");
            sc.close();
            return;
        }

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int minimum = numbers[0];
        int maxDifference = numbers[1] - numbers[0];

        for (int i = 1; i < size; i++) {

            int difference = numbers[i] - minimum;

            if (difference > maxDifference) {
                maxDifference = difference;
            }

            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }

        if (maxDifference > 0) {
            System.out.println("Maximum Difference: " + maxDifference);
        } else {
            System.out.println("No Positive Difference Found");
        }

        sc.close();
    }
}