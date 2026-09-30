package com.logical;

import java.util.Scanner;

public class CountInversions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                if (numbers[i] > numbers[j]) {
                    count++;
                }
            }
        }

        System.out.println("Total Inversions: " + count);

        sc.close();
    }
}