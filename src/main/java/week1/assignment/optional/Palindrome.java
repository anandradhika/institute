package week1.assignment.optional;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		//Declare a String text with a value
		//String text = "madam";
		//Declare another String rev
		String original, reverse = ""; // Objects of String class
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter a string to check if it is a palindrome");
	    original = in.nextLine();

	    int length = original.length();

	    for (int i = length - 1; i >= 0; i--)
	      reverse = reverse + original.charAt(i);

	    if (original.equals(reverse))
	      System.out.println("The string is a palindrome.");
	    else
	      System.out.println("The string isn't a palindrome.");
	  }
			
		}
		
		
		
		//Build a logic to find the given string is palindrome or not
		/*
		 * Pseudo Code
		 * a) Iterate over the String in reverse order
		 * b) Add the char into rev
		 * c) Compare text and rev, if it is same then print palindrome 
		 */




