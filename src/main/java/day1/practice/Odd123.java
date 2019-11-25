package day1.practice;

import java.util.Scanner;

public class Odd123 {

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		n = sc.nextInt();
		for (int i = 1; i <= 20; i++) {
			if (i%2==0) {            //if(i%2!=0 only come odd number only
				System.out.println("even number :: "+i);
			} else {
				System.out.println("odd number :: "+i);
			}
		}
	}
}
