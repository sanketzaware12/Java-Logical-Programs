package com.logical;

import java.util.Scanner;

public class RemoveSpaces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch != ' ') {
                result = result + ch;
            }
        }

        System.out.println("Original String: " + text);
        System.out.println("String Without Spaces: " + result);

        sc.close();
    }
}