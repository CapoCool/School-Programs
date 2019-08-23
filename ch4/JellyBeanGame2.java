// ****************************************************************
//   Program Name: JellyBeanGame.java - SKELETON CODE for STEP 1
//   Author: Dillan Poorman
//   Class: CSC110AA
//   Date: 2/23/2018
//   Description:
//   Play a game where the user tries to guess the
//   number of jellybeans in a jar.  Can range from 1 to 1000
//   
//   Uses a do..while loop.
//
// ****************************************************************
package ch4;
import java.util.*;

public class JellyBeanGame2
{
    public static void main(String[] args)
    {
        int numOfJellyBeans;       //Number of jellybeans in jar
        int guess, count;
        String word = "y";
        
        Random generator = new Random();
        Scanner input = new Scanner(System.in);
    
        //Nested do while, one executes the code as long as word equals "y" or "Y"
        //the other executes off of the other and as long as their guess isn't the
        //amount of jelly beans.
    do 
    {
    		count = 0;
    		numOfJellyBeans = generator.nextInt(1000) + 1;
    		System.out.println("There are between 1 and 1000 jellybeans in the jar");
    		System.out.println("How many do you think are in the jar?");
    		//System.out.println(numOfJellyBeans);
    		
    	do 
    	{
    		System.out.print("Enter your guess: ");
    		guess = input.nextInt();
    		count++;
    		
    		if (guess < numOfJellyBeans)
    		{
    			System.out.println("Too low!");	
    		}
    		else if (guess > numOfJellyBeans)
    		{
    			System.out.println("Too high!");
    		}
    		
    	}while (guess != numOfJellyBeans);
    	
    	System.out.println("You guessed right, after " + count + " guesses!");
    	System.out.print("\nDo you want to play again? (y/n)");
    	word = input.next(); //I had to look it up for this next part
    						 //but I have to use .next, not .nextLine to get it
    						 //to work
  
    		
    	
    }while (word.equals("Y") || word.equals("y"));
    
    System.out.print("Thanks for playing!");
    }
}

