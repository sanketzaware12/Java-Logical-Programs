package com.logical;

import java.util.Scanner;

public class EquilibriumIndex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int totalSum = 0;

        // Calculate total sum
        for (int number : numbers) {
            totalSum = totalSum + number;
        }

        int leftSum = 0;
        int equilibriumIndex = -1;

        for (int i = 0; i < size; i++) {

            // Remove current element and remaining becomes right sum
            totalSum = totalSum - numbers[i];

            if (leftSum == totalSum) {
                equilibriumIndex = i;
                break;
            }

            leftSum = leftSum + numbers[i];
        }

        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium Index: " + equilibriumIndex);
        } else {
            System.out.println("No Equilibrium Index Found");
        }

        sc.close();
    }
}