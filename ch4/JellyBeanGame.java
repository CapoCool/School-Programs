package ch4;
import java.util.Scanner;
import java.util.Random;

public class JellyBeanGame
{
    public static void main(String[] args)
    {
        int numOfJellyBeans = 0;       //Number of jelly beans in jar
        int guess = 0;                 //The user's guess
        String again = "y";
        
		Random generator = new Random();
		Scanner scan = new Scanner (System.in);

		//randomly generate the number of jelly beans in jar
		
	do
	{
            int guesses = 0;
			numOfJellyBeans = generator.nextInt(1000) + 1;
			System.out.println("There are between 1 and 1000 jellybeans in the jar.");
			System.out.println("How many do you think are in the jar?");
			System.out.println(numOfJellyBeans);
		do
		{

		
			System.out.print("Enter your guess:");
			guess = scan.nextInt();
			guesses++;
			//prompt user to guess and read in 
		 
			if (guess < numOfJellyBeans)
			{
				System.out.println("Too Low!!");
			}
			else if (guess > numOfJellyBeans)
			{
				System.out.println("Too High!!");
			}
		 
			//if the guess is wrong display message
		 
		 
		}while (guess != numOfJellyBeans);
			
					
		System.out.println("You guessed right!! You got it after " + guesses + " tries ");
				
		 	
		  // display message saying guess is correct

			System.out.print("\nDo you want to play again? Y or N: ");
			again = scan.next();

		
	}while(again.equals("Y") || again.equals("y"));
		
	System.out.print("Thanks for playing!!");
    }
}
      
