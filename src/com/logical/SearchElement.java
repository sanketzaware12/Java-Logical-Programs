package com.logical;

import java.util.Scanner;

public class SearchElement {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < size; i++) {

            if (numbers[i] == search) {
                found = true;
                System.out.println(search + " found at index: " + i);
                break;
            }
        }

        if (!found) {
            System.out.println(search + " is not present in the array");
        }

        sc.close();
    }

}
