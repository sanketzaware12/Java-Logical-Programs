package com.logical;

import java.util.Scanner;

public class ArrayLeaders {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Leader Elements:");

        for (int i = 0; i < size; i++) {

            boolean isLeader = true;

            for (int j = i + 1; j < size; j++) {

                if (numbers[i] <= numbers[j]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) {
                System.out.print(numbers[i] + " ");
            }
        }

        sc.close();
    }
}