package game;
import java.util.*;

public class SurvivalGame {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String name;
		int num;
		
		System.out.println("Welcome to my game! Here I will ask you questions and your answers will determine your survival.");
		System.out.println("What is your name?");
		name = scan.nextLine();
		
		System.out.println("It's the year 2020, you're a student named " + name + " at Someplace Community College. You're in Calculus when the teacher asks you...");
		System.out.println(name + ", What is 2 + 2?");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n1. It's 4!\n2. Ummm.... 27?\n3. Fuck you, bitch! *Takes shit on desk*\n4. *Say nothing*");
		num = scan.nextInt();
		
			if (num == 1) {
				System.out.println("\"Correct! Nice Work!");
				
		 	} else if (num == 2) {
		 		System.out.println("Okay, anyone else?");
		 		
		 	} else if (num == 3) {
		 		System.out.println("You've been kicked out of school and you lose");
		 		System.exit(0);
		 		
		 	} else if (num == 4) {
		 		System.out.println("God you're fucking useless!");
		 		
		 	} else {
		 		System.out.println("");
		 	}
		
			 

	}

}
