package com.logical;

import java.util.Scanner;

public class LargestElement {
	
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter array size: ");
	        int size = sc.nextInt();

	        int[] numbers = new int[size];

	        System.out.println("Enter " + size + " numbers:");

	        for (int i = 0; i < size; i++) {
	            numbers[i] = sc.nextInt();
	        }

	        int largest = numbers[0];

	        for (int i = 1; i < size; i++) {

	            if (numbers[i] > largest) {
	                largest = numbers[i];
	            }
	        }

	        System.out.println("Largest Number: " + largest);

	        sc.close();
	    }

}
