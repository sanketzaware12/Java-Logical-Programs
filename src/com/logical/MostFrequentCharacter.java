package com.logical;

import java.util.Scanner;

public class MostFrequentCharacter {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char mostFrequent = '\0';
        int maxCount = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            int count = 0;

            for (int j = 0; j < text.length(); j++) {

                if (ch == text.charAt(j)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = ch;
            }
        }

        if (mostFrequent != '\0') {
            System.out.println("Most Frequent Character: " + mostFrequent);
            System.out.println("Frequency: " + maxCount);
        } else {
            System.out.println("String is empty.");
        }

        sc.close();
    }
}
