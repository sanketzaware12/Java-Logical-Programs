package com.logical;

import java.util.Scanner;

public class ReverseEachWord {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = text.trim().split("\\s+");

        String result = "";

        for (String word : words) {

            String reverse = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reverse = reverse + word.charAt(i);
            }

            result = result + reverse + " ";
        }

        System.out.println("Original Sentence: " + text);
        System.out.println("After Reversing Each Word: " + result.trim());

        sc.close();
    }
}
