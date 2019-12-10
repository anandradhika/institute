package week1.assignments;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		// Here is the input 
				int[] arr1 = {3,2,11,4,6,7};
				int[] arr2 = {1,2,8,4,9,7};
				
				
				//Build a logic to identify the intersection between given arrays
				Arrays.sort(arr1);

				for (int i = 0; i < arr1.length; i++) {
					System.out.print(arr1[i]);
				}
					System.out.print("\n");

					for (int j = 0; j < arr2.length; j++) {
						System.out.print(arr2[j]);
						arr1.equals(arr2) ;
						
						/*if(arr1==arr2)
						{
							System.out.println("matching the value::"+arr1);
						}
						else
						{
							System.out.println("not matching the value ::");
						}*/

							}
					}
					
				/* Pseudo Code: 
				 * 1)Traverse through each array item for each given array (use nested for loop)
				 * 2)Compare both the arrays 
				 * 3) Print the matching item
				 */

	}


