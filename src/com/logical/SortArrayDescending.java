package com.logical;

import java.util.Scanner;

public class SortArrayDescending {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Sorting array in descending order
        for (int i = 0; i < size - 1; i++) {

            for (int j = i + 1; j < size; j++) {

                if (numbers[i] < numbers[j]) {

                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("Array in Descending Order:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        sc.close();
    }

}
