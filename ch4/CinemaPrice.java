//Program Name: CinemaPrice.java
//Author Name: Dillan Poorman
//Class: CSC110AA
//Date: 2/15/2018
//Description: This program calculates the total cost of a movie ticket based on
//age. Under 5 is free. 5 to 12 is half price. 13 to 54. 55 and over is free
package ch4;

import java.util.*;
import java.text.NumberFormat;

public class CinemaPrice 
{

	public static void main(String[] args) 
	{
		int age1 = 1;
		double price1, totalCost;
		
		
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		System.out.print("Please enter the cinema ticket price: ");
		price1 = input.nextDouble();
		
		System.out.print("Please enter your age (0 to quit): ");
		age1 = input.nextInt();
		
		System.out.print("Your age: " + age1);
		
		
		if (age1 < 5 || age1 > 54)
		{
			System.out.println("\nYour ticket price is: " + fmt.format(0.00) +
								" which is free");
		}
		else if (age1 > 4  && age1 < 13)
		{
			totalCost = price1 / 2;
			System.out.println("\nYour ticket price is: " + fmt.format(totalCost) + " which is half off");
		}
		
		else
		{ 
			System.out.println("\nYour ticket price is: " + fmt.format(price1) + " which is full price");
		}
		/*Case 1:
          Please enter the cinema ticket price: 2
          Your age: 55
          Your ticket price is: $0.00 which is free
		  
		  Case 2:
		  Please enter the cinema ticket price: 14.95
		  Your age: 24
		  Your ticket price is: $14.95 which is full price
		  
		  Case 3:
		  Please enter the cinema ticket price: 13.80
		  Your age: 7
		  Your ticket price is: $6.90 which is half off	 
		 */
		
		

	}

}