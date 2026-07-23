package com.logical;

import java.util.Scanner;

public class StringRotation {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = sc.nextLine();

        System.out.print("Enter second string: ");
        String second = sc.nextLine();

        if (first.length() == second.length()
                && (first + first).contains(second)) {

            System.out.println("Strings are Rotations");

        } else {

            System.out.println("Strings are Not Rotations");
        }

        sc.close();
    }
}
