package com.logical;

import java.util.Scanner;

public class FirstRepeatedCharacter {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char result = '\0';

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            for (int j = i + 1; j < text.length(); j++) {

                if (ch == text.charAt(j)) {
                    result = ch;
                    break;
                }
            }

            if (result != '\0') {
                break;
            }
        }

        if (result != '\0') {
            System.out.println("First Repeated Character: " + result);
        } else {
            System.out.println("No Repeated Character Found");
        }

        sc.close();
    }
}
