


/* 	Oh no! You're a secret agent, your previous alias has been compromised.
		 	Luckily you took a class at CGCC for Java programming and you remembered
		 	ArrayLists taught to you by some goofy looking classmates. For some reason
		 	instead of just creating an alias on your own, you decided to make it 
		 	difficult on yourself and write a program to do it for you.
		 	
		 	Use array lists to generate a new identity */
		
package ch8;

import java.util.*;

public class NewIdentityMaker 
{

	public static void main(String[] args) 
	{
		int random;
		
		//Create the ArrayList object, be sure to add <String> 
		ArrayList<String> array = new ArrayList<String>();
		
		//add a list of 5 first names number 1 - 5 to indicate each row
		array.add("Dillan");
		array.add("Jesse");
		array.add("Bobby");
		array.add("Jorge");
		array.add("Steve");
		
		
		//add a list of 5 last names
		array.add("Robinson");
		array.add("Poorman");
		array.add("Hood");
		array.add("Kaliqhi");
		array.add("Bengo");
		
		
		//add 5 countries (could be fictional for some added humour)
		array.add("North Korea");
		array.add("America");
		array.add("Narnia");
		array.add("Africa");
		array.add("Russia");
		
		//List of hair color
		array.add("Black");
		array.add("Red");
		array.add("Blonde");
		array.add("Brown");
		array.add("Blue");
		
		
		//Use random generator to randomly select the array index number, but be sure to remember what
		//range of the index holds
		
		Random gen = new Random();
		
		System.out.println("Your new first and last name is: " + array.get(random = gen.nextInt(5))
							+ " " + array.get(random = gen.nextInt(5) + 5) + " and your from the country "
							+ array.get(random = gen.nextInt(5) + 10 ));
		
		//Challenge: Add more elements (age, what school you attended, try and 
		//write an entire backstory using random generator and ArrayList
		
		


		
		
		
		
		
		

	}

}
		
		
		
		
		

