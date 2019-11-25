package day2.classroom.arrays;

import java.util.Arrays;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;

public class PrintDuplicates {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data= {1,3,8,3,11,5,6,4,7,6,7};
		Arrays.sort(data);
	
		for(int i =0;i<data.length;i++)
		{
			if(data.length != i+1)
			if(data[i]==data[i+1]) {
				System.out.println("dublicate value is::"+data[i]);
				System.out.println(data[data.length-2]);
			}
		}
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Loop through each array item
		 3) If the consecutive array items are same -> then print as duplicates
		 */
		
		
		
		
		
		
		
		// Print the second largest number	
		
		
	}

}
