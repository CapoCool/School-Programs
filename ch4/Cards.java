//Program Name: Cards.java
//Author: Dillan Poorman
//Class: CSC110AA
//Date: 2/15/2018
//Randomly selects card # and suits
package ch4;

import java.util.*;

public class Cards 
{

	public static void main(String[] args) 
	{
		int num1, num2;
		String ace = "Ace", jack = "Jack", queen = "Queen", king = "King";
		
		Random generator = new Random();
		
		num2 = generator.nextInt(13) + 1;
		num1 = generator.nextInt(4) + 1;
		
		//uses random # to find the case generated 1-13
		switch (num2)
		{
		case 1:
			System.out.print("You have selected the " + ace);
			break;
		case 2:
			System.out.print("You have selected the " + num2);
			break;
		case 3:
			System.out.print("You have selected the " + num2);
			break;
		case 4:
			System.out.print("You have selected the " + num2);
			break;
		case 5:
			System.out.print("You have selected the " + num2);
			break;
		case 6:
			System.out.print("You have selected the " + num2);
			break;
		case 7:
			System.out.print("You have selected the " + num2);
			break;
		case 8:
			System.out.print("You have selected the " + num2);
			break;
		case 9:
			System.out.print("You have selected the " + num2);
			break;
		case 10:
			System.out.print("You have selected the " + num2);
			break;
		case 11:
			System.out.print("You have selected the " + jack);
			break;
		case 12:
			System.out.print("You have selected the " + queen);
			break;
		case 13:
			System.out.print("You have selected the " + king);
			break;
		}
		//used with random # 1-4 to find suite
		switch (num1)
		{
		case 1:
			System.out.print(" of Clubs!");
			break;
		case 2:
			System.out.print(" of Hearts!");
			break;
		case 3:
			System.out.print(" of Diamonds!");
			break;
		case 4:
			System.out.print(" of Spades!");
			break;
			
			/*Cases:
			 * You have selected the 4 of Spades!
			 * You have selected the King of Diamonds!
			 * You have selected the 3 of Spades!
			 * You have selected the Queen of Clubs!
			 */
		}
	}
}


