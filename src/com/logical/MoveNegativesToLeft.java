package com.logical;

import java.util.Scanner;

public class MoveNegativesToLeft {

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

        // Move negative numbers to the left
        for (int i = 0; i < size; i++) {

            if (numbers[i] < 0) {

                int temp = numbers[i];
                numbers[i] = numbers[position];
                numbers[position] = temp;

                position++;
            }
        }

        System.out.println("Array after moving negative numbers to left:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        sc.close();
    }
}