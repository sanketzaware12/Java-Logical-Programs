package com.logical;

import java.util.Scanner;

public class SecondMostFrequentElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int highestFrequency = 0;
        int secondHighestFrequency = 0;

        // Find highest frequency
        for (int i = 0; i < size; i++) {

            int count = 0;

            for (int j = 0; j < size; j++) {

                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            if (count > highestFrequency) {
                highestFrequency = count;
            }
        }

        // Find second highest frequency
        for (int i = 0; i < size; i++) {

            int count = 0;

            for (int j = 0; j < size; j++) {

                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            if (count < highestFrequency
                    && count > secondHighestFrequency) {

                secondHighestFrequency = count;
            }
        }

        if (secondHighestFrequency == 0) {

            System.out.println("Second Most Frequent Element Does Not Exist.");

        } else {

            boolean found = false;

            for (int i = 0; i < size; i++) {

                int count = 0;

                for (int j = 0; j < size; j++) {

                    if (numbers[i] == numbers[j]) {
                        count++;
                    }
                }

                if (count == secondHighestFrequency) {

                    System.out.println(
                            "Second Most Frequent Element: " + numbers[i]);

                    System.out.println(
                            "Frequency: " + secondHighestFrequency);

                    found = true;
                    break;
                }
            }
        }

        sc.close();
    }
}