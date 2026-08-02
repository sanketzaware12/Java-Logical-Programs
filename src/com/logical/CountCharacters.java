package com.logical;

import java.util.Scanner;

public class CountCharacters {
	
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String text = sc.nextLine();

	        int letters = 0;
	        int digits = 0;
	        int specialCharacters = 0;

	        for (int i = 0; i < text.length(); i++) {

	            char ch = text.charAt(i);

	            if (Character.isLetter(ch)) {
	                letters++;
	            } 
	            else if (Character.isDigit(ch)) {
	                digits++;
	            } 
	            else {
	                specialCharacters++;
	            }
	        }

	        System.out.println("Letters: " + letters);
	        System.out.println("Digits: " + digits);
	        System.out.println("Special Characters: " + specialCharacters);

	        sc.close();
	    }

}
