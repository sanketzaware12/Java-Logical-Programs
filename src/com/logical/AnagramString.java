package com.logical;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = sc.nextLine();

        System.out.print("Enter second string: ");
        String second = sc.nextLine();

        // Convert strings to lowercase
        first = first.toLowerCase();
        second = second.toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (first.length() != second.length()) {

            System.out.println("Not an Anagram");

        } else {

            char[] firstArray = first.toCharArray();
            char[] secondArray = second.toCharArray();

            // Sort both character arrays
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);

            // Compare sorted arrays
            if (Arrays.equals(firstArray, secondArray)) {
                System.out.println("Anagram Strings");
            } else {
                System.out.println("Not Anagram Strings");
            }
        }

        sc.close();
    }
}
