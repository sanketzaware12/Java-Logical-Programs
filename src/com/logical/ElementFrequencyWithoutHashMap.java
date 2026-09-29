package com.logical;

import java.util.Scanner;

public class ElementFrequencyWithoutHashMap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Invalid array size.");
            sc.close();
            return;
        }

        int[] numbers = new int[size];
        boolean[] visited = new boolean[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Element Frequencies:");

        for (int i = 0; i < size; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < size; j++) {

                if (numbers[i] == numbers[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(numbers[i] + " → " + count + " time(s)");
        }

        sc.close();
    }
}