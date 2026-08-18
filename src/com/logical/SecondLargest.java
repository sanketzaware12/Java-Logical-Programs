package com.logical;

import java.util.Scanner;

public class SecondLargest {
	
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter array size: ");
	        int size = sc.nextInt();

	        if (size < 2) {
	            System.out.println("Array must contain at least 2 elements.");
	            sc.close();
	            return;
	        }

	        int[] numbers = new int[size];

	        System.out.println("Enter " + size + " numbers:");

	        for (int i = 0; i < size; i++) {
	            numbers[i] = sc.nextInt();
	        }

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int number : numbers) {

	            if (number > largest) {
	                secondLargest = largest;
	                largest = number;
	            } else if (number > secondLargest && number != largest) {
	                secondLargest = number;
	            }
	        }

	        if (secondLargest == Integer.MIN_VALUE) {
	            System.out.println("Second largest element does not exist.");
	        } else {
	            System.out.println("Largest Number: " + largest);
	            System.out.println("Second Largest Number: " + secondLargest);
	        }

	        sc.close();
	    }

}
