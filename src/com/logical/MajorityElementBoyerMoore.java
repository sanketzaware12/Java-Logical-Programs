package com.logical;

import java.util.Scanner;

public class MajorityElementBoyerMoore {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int candidate = 0;
        int count = 0;

        // Find candidate
        for (int number : numbers) {

            if (count == 0) {
                candidate = number;
            }

            if (number == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Verify candidate
        count = 0;

        for (int number : numbers) {

            if (number == candidate) {
                count++;
            }
        }

        if (count > size / 2) {
            System.out.println("Majority Element: " + candidate);
        } else {
            System.out.println("No Majority Element Found");
        }

        sc.close();
    }
}