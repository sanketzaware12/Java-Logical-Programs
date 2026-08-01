package com.logical;

import java.util.Scanner;

public class FirstNonRepeatedCharacter {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char result = '\0';

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            int count = 0;

            for (int j = 0; j < text.length(); j++) {

                if (ch == text.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                result = ch;
                break;
            }
        }

        if (result != '\0') {
            System.out.println("First Non-Repeated Character: " + result);
        } else {
            System.out.println("No Non-Repeated Character Found");
        }

        sc.close();
    }

}
