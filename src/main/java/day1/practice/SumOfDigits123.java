package day1.practice;

import java.util.Scanner;

public class SumOfDigits123 {

	public static void main(String[] args) {

		
		 int member, rem, sum1 = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number:");
	        member=s.nextInt();
	        while(member > 0)
	        {
	          rem = member % 10;
	            sum1 = sum1 + rem;
	            member = member / 10;
	        }
	        System.out.println("Sum of Digits :" +""+sum1);
		}
		
		
	}

