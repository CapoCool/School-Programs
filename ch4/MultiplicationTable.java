/*
Program Name :  MultiplicationTable.java
Author : Dillan Poorman
Date : 3/9/2018
Class: CSC110AA/AB and CIS163AA
Description:
		  This program prompts the user for a number 1 - 5, 
		  checks for bad input,
		  and creates a multiplication table.
		  Student completes.
*/

package ch4;

import java.util.Scanner;

/* produces a multiplication table of integers */

public class MultiplicationTable 
{
	public static void main(String[] args) 
	{
		int size = 1;
		int value;
		Scanner scan = new Scanner (System.in);
		
		
		while (size != 0) 
		{
			//read in size of multiplication table
			System.out.print("Please enter the table size from 1 to 12 (0 to quit): ");
			size = scan.nextInt();
			
			if (size == 0)
			{
				System.out.println("\nDone!");//I gave "done" a little space in the
											  //console for easier readability
											  //for a user
			}
			else if (size > 12 || size < 1)
			{
				System.out.println("Table size must be 1 to 5. Try again.");
			}
			
			else
			{

				//using a for loop, display the top header row of numbers
		
				System.out.print("\t");
		
				for (int horiz = 1; horiz <= size; horiz++)
				{
					System.out.print(horiz + "\t");
				}

				System.out.println();
				
				//using a for loop, display the top header row underline (use a dash)
				
				System.out.print("\t");
				
				for (int horiz = 1; horiz <= size; horiz++)
				{
					System.out.print("-" + "\t");		
				}

				System.out.println();
		
		
				/* using a nested for loop create the rest of the table */
				for (int x = 1; x <= size; x++)
				{
					System.out.print(x + "|");
			
					for (int y = 1; y <= size; y++) 
					{
				
						System.out.print("\t" + x * y);
			
					}
					
					System.out.println();
					
					/*
					 * Please enter the table size from 1 to 5 (0 to quit): 3
							1	2	3	
							-	-	-	
						1|	1	2	3
						2|	2	4	6
						3|	3	6	9
						Please enter the table size from 1 to 5 (0 to quit): 8
						Table size must be 1 to 5. Try again.
						Please enter the table size from 1 to 5 (0 to quit): 0

						Done!

					 */
					
				}
				
			}
			
		}			
				
	}
}
