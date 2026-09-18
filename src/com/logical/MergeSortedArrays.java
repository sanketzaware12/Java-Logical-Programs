package com.logical;

import java.util.Scanner;

public class MergeSortedArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first array size: ");
        int size1 = sc.nextInt();

        int[] firstArray = new int[size1];

        System.out.println("Enter sorted elements of first array:");

        for (int i = 0; i < size1; i++) {
            firstArray[i] = sc.nextInt();
        }

        System.out.print("Enter second array size: ");
        int size2 = sc.nextInt();

        int[] secondArray = new int[size2];

        System.out.println("Enter sorted elements of second array:");

        for (int i = 0; i < size2; i++) {
            secondArray[i] = sc.nextInt();
        }

        int[] mergedArray = new int[size1 + size2];

        int i = 0;
        int j = 0;
        int k = 0;

        // Compare elements from both arrays
        while (i < size1 && j < size2) {

            if (firstArray[i] <= secondArray[j]) {
                mergedArray[k] = firstArray[i];
                i++;
            } else {
                mergedArray[k] = secondArray[j];
                j++;
            }

            k++;
        }

        // Add remaining elements from first array
        while (i < size1) {
            mergedArray[k] = firstArray[i];
            i++;
            k++;
        }

        // Add remaining elements from second array
        while (j < size2) {
            mergedArray[k] = secondArray[j];
            j++;
            k++;
        }

        System.out.println("Merged Sorted Array:");

        for (int number : mergedArray) {
            System.out.print(number + " ");
        }

        sc.close();
    }
}