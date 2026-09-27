package com.logical;

import java.util.Scanner;

public class MinMaxWithoutSorting {

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

        int minimum = numbers[0];
        int maximum = numbers[0];

        for (int i = 1; i < size; i++) {

            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }

            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);

        sc.close();
    }
}