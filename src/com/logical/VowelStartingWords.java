package com.logical;

import java.util.Scanner;

public class VowelStartingWords {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = text.trim().split("\\s+");

        int count = 0;

        for (String word : words) {

            char firstChar = Character.toLowerCase(word.charAt(0));

            if (firstChar == 'a' || firstChar == 'e'
                    || firstChar == 'i' || firstChar == 'o'
                    || firstChar == 'u') {

                count++;
            }
        }

        System.out.println("Words Starting With Vowel: " + count);

        sc.close();
    }
	
}
