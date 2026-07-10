package com.logical;

import java.util.Scanner;

public class PairWithGivenSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        boolean pairFound = false;

        for (int i = 0; i < size - 1; i++) {

            for (int j = i + 1; j < size; j++) {

                if (numbers[i] + numbers[j] == target) {

                    System.out.println("Pair: "
                            + numbers[i] + " and " + numbers[j]);

                    pairFound = true;
                    break;
                }
            }

            if (pairFound) {
                break;
            }
        }

        if (!pairFound) {
            System.out.println("No pair found.");
        }

        sc.close();
    }
}