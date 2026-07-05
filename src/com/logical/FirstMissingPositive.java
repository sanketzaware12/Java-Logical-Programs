package com.logical;

import java.util.Scanner;

public class FirstMissingPositive {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int missingNumber = 1;

        while (true) {

            boolean found = false;

            for (int i = 0; i < size; i++) {

                if (numbers[i] == missingNumber) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                break;
            }

            missingNumber++;
        }

        System.out.println("First Missing Positive: " + missingNumber);

        sc.close();
    }
}