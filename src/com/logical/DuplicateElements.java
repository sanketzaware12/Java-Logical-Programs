package com.logical;

import java.util.Scanner;

public class DuplicateElements {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements:");

        boolean duplicateFound = false;

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                if (numbers[i] == numbers[j]) {

                    boolean alreadyPrinted = false;

                    for (int k = 0; k < i; k++) {
                        if (numbers[k] == numbers[i]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }

                    if (!alreadyPrinted) {
                        System.out.print(numbers[i] + " ");
                        duplicateFound = true;
                    }

                    break;
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No duplicate elements found.");
        }

        sc.close();
    }

}
