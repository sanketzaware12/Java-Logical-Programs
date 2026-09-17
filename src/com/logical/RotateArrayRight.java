package com.logical;

import java.util.Scanner;

public class RotateArrayRight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        // If k is greater than array size
        k = k % size;

        for (int rotation = 1; rotation <= k; rotation++) {

            int last = numbers[size - 1];

            for (int i = size - 1; i > 0; i--) {
                numbers[i] = numbers[i - 1];
            }

            numbers[0] = last;
        }

        System.out.println("Array after right rotation:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        sc.close();
    }
}
