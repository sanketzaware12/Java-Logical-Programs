package com.logical;

import java.util.Scanner;

public class PalindromeNum {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        int originalNumber = number;
	        int reverse = 0;

	        while (number != 0) {
	            int digit = number % 10;
	            reverse = reverse * 10 + digit;
	            number = number / 10;
	        }

	        if (originalNumber == reverse) {
	            System.out.println("Palindrome Number");
	        } else {
	            System.out.println("Not a Palindrome Number");
	        }

	        sc.close();
	    }
	}


