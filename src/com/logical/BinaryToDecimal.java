package com.logical;

import java.util.Scanner;

public class BinaryToDecimal {
	
	  public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a binary number: ");
	        int binary = sc.nextInt();

	        int originalNumber = binary;
	        int decimal = 0;
	        int power = 0;

	        while (binary != 0) {

	            int digit = binary % 10;

	            if (digit != 0 && digit != 1) {
	                System.out.println("Invalid Binary Number");
	                sc.close();
	                return;
	            }

	            decimal = decimal + digit * (int) Math.pow(2, power);

	            binary = binary / 10;
	            power++;
	        }

	        System.out.println("Binary Number: " + originalNumber);
	        System.out.println("Decimal Number: " + decimal);

	        sc.close();
	    }

}
