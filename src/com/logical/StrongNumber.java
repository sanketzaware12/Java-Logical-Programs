package com.logical;

import java.util.Scanner;

public class StrongNumber {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        while (number != 0) {

            int digit = number % 10;

            int factorial = 1;

            for (int i = 1; i <= digit; i++) {
                factorial = factorial * i;
            }

            sum = sum + factorial;
            number = number / 10;
        }

        if (originalNumber > 0 && sum == originalNumber) {
            System.out.println(originalNumber + " is a Strong Number");
        } else {
            System.out.println(originalNumber + " is Not a Strong Number");
        }

        sc.close();
    }

}
