package com.logical;

import java.util.Scanner;

public class LongestWord {
	
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a sentence: ");
	        String text = sc.nextLine();

	        String[] words = text.trim().split("\\s+");

	        String longestWord = "";

	        for (String word : words) {

	            if (word.length() > longestWord.length()) {
	                longestWord = word;
	            }
	        }

	        System.out.println("Longest Word: " + longestWord);
	        System.out.println("Length: " + longestWord.length());

	        sc.close();
	    }

}
