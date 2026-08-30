package com.logical;

import java.util.Scanner;

public class SumOfArray {
	
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter array size: ");
	        int size = sc.nextInt();

	        int[] numbers = new int[size];

	        System.out.println("Enter " + size + " numbers:");

	        int sum = 0;

	        for (int i = 0; i < size; i++) {
	            numbers[i] = sc.nextInt();
	            sum = sum + numbers[i];
	        }

	        System.out.println("Sum of Array Elements: " + sum);

	        sc.close();
	    }

}
