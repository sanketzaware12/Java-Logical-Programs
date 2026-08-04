package com.logical;

import java.util.Scanner;

public class CharacterFrequency {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        boolean[] visited = new boolean[text.length()];

        System.out.println("Character Frequency:");

        for (int i = 0; i < text.length(); i++) {

            if (visited[i]) {
                continue;
            }

            char ch = text.charAt(i);

            int count = 1;

            for (int j = i + 1; j < text.length(); j++) {

                if (ch == text.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(ch + " = " + count);
        }

        sc.close();
    }
	
}
