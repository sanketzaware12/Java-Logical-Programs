package com.logical;

import java.util.Scanner;

public class RemoveDuplicates {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < size; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {

                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(numbers[i] + " ");
            }
        }

        sc.close();
    }

}
