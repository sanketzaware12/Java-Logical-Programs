package com.logical;

import java.util.Scanner;

public class CommonElements {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first array size: ");
        int size1 = sc.nextInt();

        int[] firstArray = new int[size1];

        System.out.println("Enter " + size1 + " elements:");

        for (int i = 0; i < size1; i++) {
            firstArray[i] = sc.nextInt();
        }

        System.out.print("Enter second array size: ");
        int size2 = sc.nextInt();

        int[] secondArray = new int[size2];

        System.out.println("Enter " + size2 + " elements:");

        for (int i = 0; i < size2; i++) {
            secondArray[i] = sc.nextInt();
        }

        System.out.println("Common Elements:");

        for (int i = 0; i < size1; i++) {

            boolean found = false;

            for (int j = 0; j < size2; j++) {

                if (firstArray[i] == secondArray[j]) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.print(firstArray[i] + " ");
            }
        }

        sc.close();
    }
	
}
