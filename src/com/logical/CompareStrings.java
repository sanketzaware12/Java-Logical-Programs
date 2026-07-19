package com.logical;

import java.util.Scanner;

public class CompareStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = sc.nextLine();

        System.out.print("Enter second string: ");
        String second = sc.nextLine();

        boolean isEqual = true;

        if (first.length() != second.length()) {

            isEqual = false;

        } else {

            for (int i = 0; i < first.length(); i++) {

                if (first.charAt(i) != second.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        }

        if (isEqual) {
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings are Not Equal");
        }

        sc.close();
    }
}