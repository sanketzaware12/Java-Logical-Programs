package com.logical;

import java.util.Scanner;

public class SecondSmallest {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        if (size < 2) {
            System.out.println("Array must contain at least 2 elements.");
            sc.close();
            return;
        }

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : numbers) {

            if (number < smallest) {
                secondSmallest = smallest;
                smallest = number;
            } else if (number < secondSmallest && number != smallest) {
                secondSmallest = number;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Second smallest element does not exist.");
        } else {
            System.out.println("Smallest Number: " + smallest);
            System.out.println("Second Smallest Number: " + secondSmallest);
        }

        sc.close();
    }
}
