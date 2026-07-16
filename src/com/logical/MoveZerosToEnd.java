package com.logical;

import java.util.Scanner;

public class MoveZerosToEnd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int position = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < size; i++) {

            if (numbers[i] != 0) {
                numbers[position] = numbers[i];
                position++;
            }
        }

        // Fill remaining positions with zero
        while (position < size) {
            numbers[position] = 0;
            position++;
        }

        System.out.println("Array after moving zeros to end:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        sc.close();
    }
}