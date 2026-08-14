package com.logical;

import java.util.Scanner;

public class ElementFrequency {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter element to find frequency: ");
        int search = sc.nextInt();

        int count = 0;

        for (int i = 0; i < size; i++) {

            if (numbers[i] == search) {
                count++;
            }
        }

        System.out.println(search + " occurs " + count + " time(s) in the array.");

        sc.close();
    }

}
