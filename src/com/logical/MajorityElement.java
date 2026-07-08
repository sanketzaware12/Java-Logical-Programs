package com.logical;

import java.util.Scanner;

public class MajorityElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int majorityElement = -1;

        for (int i = 0; i < size; i++) {

            int count = 0;

            for (int j = 0; j < size; j++) {

                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            if (count > size / 2) {
                majorityElement = numbers[i];
                break;
            }
        }

        if (majorityElement != -1) {
            System.out.println("Majority Element: " + majorityElement);
        } else {
            System.out.println("No Majority Element Found");
        }

        sc.close();
    }
}