package com.logical;

import java.util.Scanner;

public class WordFrequency {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = text.toLowerCase().trim().split("\\s+");

        boolean[] visited = new boolean[words.length];

        System.out.println("Word Frequency:");

        for (int i = 0; i < words.length; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < words.length; j++) {

                if (words[i].equals(words[j])) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(words[i] + " = " + count);
        }

        sc.close();
    }

}
