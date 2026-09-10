package com.logical;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {

            if (number % i == 0) {
                sum = sum + i;
            }
        }

        if (number > 0 && sum == number) {
            System.out.println(number + " is a Perfect Number");
        } else {
            System.out.println(number + " is Not a Perfect Number");
        }

        sc.close();
    }

}
