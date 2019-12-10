package week1.assignment.optional;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//Declare a String 
		String text1 = "stop";
		//Declare another String
		String text2 = "pots";
	    char[] array1 = text1.toCharArray();
		char[] array2 = text2.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		String sortedtext1 = new String(array1);
		String sortedtext2 = new String(array2);
		if (sortedtext1.equals(sortedtext2)) {
			System.out.println("This is  Anagram");
		}
		else
		{
			System.out.println("this is not Anagram");
		}
		
	}
		
		
		//build logic to check the given words are anagram or not
	    /*
		 * Pseudo Code
		 * a) Check length of the strings are same then
		 * 
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */

}

	


