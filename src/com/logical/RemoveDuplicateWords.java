package com.logical;

import java.util.Scanner;

public class RemoveDuplicateWords {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = text.trim().split("\\s+");

        String result = "";

        for (String word : words) {

            if (!result.contains(" " + word + " ")
                    && !result.startsWith(word + " ")
                    && !result.endsWith(" " + word)
                    && !result.equals(word)) {

                if (result.isEmpty()) {
                    result = word;
                } else {
                    result = result + " " + word;
                }
            }
        }

        System.out.println("Original Sentence: " + text);
        System.out.println("After Removing Duplicate Words: " + result);

        sc.close();
    }
}
