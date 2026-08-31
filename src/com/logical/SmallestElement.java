package com.logical;

import java.util.Scanner;

public class SmallestElement {
	
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter array size: ");
	        int size = sc.nextInt();

	        int[] numbers = new int[size];

	        System.out.println("Enter " + size + " numbers:");

	        for (int i = 0; i < size; i++) {
	            numbers[i] = sc.nextInt();
	        }

	        int smallest = numbers[0];

	        for (int i = 1; i < size; i++) {

	            if (numbers[i] < smallest) {
	                smallest = numbers[i];
	            }
	        }

	        System.out.println("Smallest Number: " + smallest);

	        sc.close();
	    }

}
