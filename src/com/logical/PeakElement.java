package com.logical;

import java.util.Scanner;

public class PeakElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        if (size < 3) {
            System.out.println("Array must contain at least 3 elements.");
            sc.close();
            return;
        }

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean peakFound = false;

        for (int i = 1; i < size - 1; i++) {

            if (numbers[i] > numbers[i - 1]
                    && numbers[i] > numbers[i + 1]) {

                System.out.println("Peak Element: " + numbers[i]);
                System.out.println("Peak Index: " + i);

                peakFound = true;
                break;
            }
        }

        if (!peakFound) {
            System.out.println("No Peak Element Found");
        }

        sc.close();
    }
}