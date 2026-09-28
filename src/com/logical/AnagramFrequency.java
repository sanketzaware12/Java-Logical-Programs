package com.logical;

import java.util.Scanner;

public class AnagramFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = sc.nextLine();

        System.out.print("Enter second string: ");
        String second = sc.nextLine();

        first = first.toLowerCase().replace(" ", "");
        second = second.toLowerCase().replace(" ", "");

        if (first.length() != second.length()) {
            System.out.println("Not Anagram");
            sc.close();
            return;
        }

        int[] frequency = new int[256];

        for (int i = 0; i < first.length(); i++) {
            frequency[first.charAt(i)]++;
            frequency[second.charAt(i)]--;
        }

        boolean isAnagram = true;

        for (int count : frequency) {

            if (count != 0) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        sc.close();
    }
}