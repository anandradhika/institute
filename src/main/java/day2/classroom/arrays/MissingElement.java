package day2.classroom.arrays;

import java.util.Arrays;

import org.apache.poi.hssf.record.chart.DataLabelExtensionRecord;

public class MissingElement {

	public static void main(String[] args) {

		// Here is the input
		int[] data = { 3, 2, 4, 6, 7, 8 };
		Arrays.sort(data);
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);

			if (data.length > 0) {
				System.out.print(data.length - 1);
			}
			// System.out.println();
		}

		/*
		 * Pseudo Code: 1) Arrange the array in ascending order 2) Traverse through each
		 * array item 3) Compare consecutive items -> the next one should be = previous
		 * one + 1 4) If the following one is not +1 -> Print as missing
		 */

		// Print the second largest number

	}

}
