package com.logical;

import java.util.Scanner;

public class SeparateEvenOdd {
	
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter array size: ");
	        int size = sc.nextInt();

	        int[] numbers = new int[size];

	        System.out.println("Enter " + size + " numbers:");

	        for (int i = 0; i < size; i++) {
	            numbers[i] = sc.nextInt();
	        }

	        System.out.print("Even Numbers: ");

	        for (int number : numbers) {
	            if (number % 2 == 0) {
	                System.out.print(number + " ");
	            }
	        }

	        System.out.println();

	        System.out.print("Odd Numbers: ");

	        for (int number : numbers) {
	            if (number % 2 != 0) {
	                System.out.print(number + " ");
	            }
	        }

	        sc.close();
	    }

}
