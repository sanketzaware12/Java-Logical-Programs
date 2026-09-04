package com.logical;

import java.util.Scanner;

public class DecimalToBinary {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        String binary = "";

        if (number == 0) {
            binary = "0";
        } else {

            while (number > 0) {

                int remainder = number % 2;

                binary = remainder + binary;

                number = number / 2;
            }
        }

        System.out.println("Decimal Number: " + originalNumber);
        System.out.println("Binary Number: " + binary);

        sc.close();
    }

}
