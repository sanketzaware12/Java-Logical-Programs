package com.logical;

import java.util.Scanner;

public class GcdLcm {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        int a = first;
        int b = second;

        // Find GCD using Euclidean Algorithm
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        int gcd = a;

        // Find LCM
        int lcm = Math.abs(first * second) / gcd;

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);

        sc.close();
    }

}
