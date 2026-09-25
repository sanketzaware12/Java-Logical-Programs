package com.logical;

import java.util.Scanner;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int longestLength = 1;
        int startNumber = numbers[0];

        for (int i = 0; i < size; i++) {

            int current = numbers[i];
            int length = 1;

            boolean foundNext = true;

            while (foundNext) {

                foundNext = false;

                for (int j = 0; j < size; j++) {

                    if (numbers[j] == current + 1) {
                        current++;
                        length++;
                        foundNext = true;
                        break;
                    }
                }
            }

            if (length > longestLength) {
                longestLength = length;
                startNumber = numbers[i];
            }
        }

        System.out.print("Longest Consecutive Sequence: ");

        for (int i = 0; i < longestLength; i++) {
            System.out.print((startNumber + i) + " ");
        }

        System.out.println();
        System.out.println("Length: " + longestLength);

        sc.close();
    }
}