//Program Name: CinemaPrice2.java
//Author: Dillan Poorman
//Class: CSC110AA
//Date: 02/16/2018
//New and improved Cinema Price calculator, with looping
package ch4;

import java.text.NumberFormat;
import java.util.*;

public class CinemaPrice2 
{
	public static void main(String[] args)
	{
		int age;
		double price; 
		double newPrice;
		
		Scanner input = new Scanner(System.in);
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		//first part of program with conditions
		System.out.print("Please enter the Cinema ticket price: ");
		price = input.nextDouble();
		
		System.out.print("Please enter your age (0 to quit): ");
		age = input.nextInt();
		
		if (age == 0)//exit strategy #1
		{
			System.out.print("Don't quit! My program is awesome!");
		}
		else if (age < 5 || age > 54) //under 5 are free, 55 and over are free
		{
			System.out.print("Your ticket price is: " + fmt.format(0.00) + " which is free");
		}
	    else if (age > 4 && age < 13) // 5 to 12 is half off
		{
			newPrice = price / 2;
			System.out.print("Your ticket price is: " + fmt.format(newPrice) + " which is half off");
		}
		else
		{
			System.out.print("Your ticket price is: " + fmt.format(price) + " which is full price");
		}
		//looping portion
		while (age != 0)
		{
			System.out.print("\n\nPlease enter the Cinema ticket price: ");
			price = input.nextDouble();
			
			System.out.print("Please enter your age (0 to quit): ");
			age = input.nextInt();
			
			if (age == 0)
			{
				System.out.print("Don't quit! My program is awesome!");
			}
		    else if (age < 5 || age > 54)
			{
				System.out.print("Your ticket price is: " + fmt.format(0.00) + " which is free");
			}
			else if (age > 4 && age < 13)
			{
				newPrice = price / 2;
				System.out.print("Your ticket price is: " + fmt.format(newPrice) + " which is half off");
			}
			else
			{
				System.out.print("Your ticket price is: " + fmt.format(price) + " which is full price");
	        }
				/*Cases:
				 * Please enter the Cinema ticket price: 8.90
                   Please enter your age (0 to quit): 45
                   Your ticket price is: $8.90 which is full price

                   Please enter the Cinema ticket price: 13
                   Please enter your age (0 to quit): 13
                   Your ticket price is: $13.00 which is full price

                   Please enter the Cinema ticket price: 12.78
                   Please enter your age (0 to quit): 6
                   Your ticket price is: $6.39 which is half off

                   Please enter the Cinema ticket price: 6
                   Please enter your age (0 to quit): 0
                   Don't quit! My program is awesome!
				 * 
				 */		            
		}	
	}
}
		

	


