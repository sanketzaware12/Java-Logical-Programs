package com.logical;

import java.util.Scanner;

public class CountEvenOdd {
	
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter array size: ");
	        int size = sc.nextInt();

	        int[] numbers = new int[size];

	        int evenCount = 0;
	        int oddCount = 0;

	        System.out.println("Enter " + size + " numbers:");

	        for (int i = 0; i < size; i++) {

	            numbers[i] = sc.nextInt();

	            if (numbers[i] % 2 == 0) {
	                evenCount++;
	            } else {
	                oddCount++;
	            }
	        }

	        System.out.println("Even Numbers Count: " + evenCount);
	        System.out.println("Odd Numbers Count: " + oddCount);

	        sc.close();
	    }
	}
