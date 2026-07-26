package com.logical;

import java.util.Scanner;

public class ShortestWord {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = text.trim().split("\\s+");

        String shortestWord = words[0];

        for (String word : words) {

            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }

        System.out.println("Shortest Word: " + shortestWord);
        System.out.println("Length: " + shortestWord.length());

        sc.close();
    }
}
