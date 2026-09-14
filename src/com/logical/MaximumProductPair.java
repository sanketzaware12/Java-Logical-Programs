package com.logical;

import java.util.Scanner;

public class MaximumProductPair {

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

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : numbers) {

            // Find two largest elements
            if (number > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }

            // Find two smallest elements
            if (number < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = number;
            } else if (number < secondSmallest) {
                secondSmallest = number;
            }
        }

        int product1 = firstLargest * secondLargest;
        int product2 = firstSmallest * secondSmallest;

        int maximumProduct = Math.max(product1, product2);

        System.out.println("Maximum Product: " + maximumProduct);

        sc.close();
    }
}