package com.logical;

import java.util.Scanner;

public class IntersectionTwoPointers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first array size: ");
        int size1 = sc.nextInt();

        int[] array1 = new int[size1];

        System.out.println("Enter first sorted array:");

        for (int i = 0; i < size1; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.print("Enter second array size: ");
        int size2 = sc.nextInt();

        int[] array2 = new int[size2];

        System.out.println("Enter second sorted array:");

        for (int i = 0; i < size2; i++) {
            array2[i] = sc.nextInt();
        }

        int i = 0;
        int j = 0;

        boolean found = false;

        System.out.print("Intersection: ");

        while (i < size1 && j < size2) {

            if (array1[i] == array2[j]) {

                System.out.print(array1[i] + " ");

                found = true;

                i++;
                j++;
            }
            else if (array1[i] < array2[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        if (!found) {
            System.out.print("No common elements found.");
        }

        System.out.println();

        sc.close();
    }
}