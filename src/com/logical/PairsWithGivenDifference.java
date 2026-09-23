package com.logical;

import java.util.Scanner;

public class PairsWithGivenDifference {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter required difference: ");
        int difference = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                int diff = Math.abs(numbers[i] - numbers[j]);

                if (diff == difference) {

                    System.out.println(
                        "Pair: " + numbers[i] + " and " + numbers[j]
                    );

                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pair found.");
        }

        sc.close();
    }
}