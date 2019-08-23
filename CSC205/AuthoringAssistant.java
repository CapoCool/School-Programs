/*Name: Dillan Poorman
 *Class: CSC205
 *Date:8/21/2019
 *Description: Authoring Assistant is a program used to manipulate a string given at the start of the program
 *It returns Number of characters minus whitespace, number of words, replaces exclamation point with a period,
 *trims excess spaces and then finds a certain word and returns the amount of times the word was uses
 */

package CSC205;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AuthoringAssistant {
	//global variables
	static Scanner scanner = new Scanner(System.in);
	
	//print menu method, returns the menu choice of the user
	public static char printMenu(Scanner scan) {
		
		System.out.println("c - Number of non-whitespace characters");
		System.out.println("w - Number of words");
		System.out.println("f - Find text");
		System.out.println("r - Replace all !'s");
		System.out.println("s - Shorten spaces");
		System.out.println("q - Quit	");
		
		char choice = scan.next().charAt(0);
		
		return (choice);
		
	}
	
	//returns length of characters minus whitespace
	public static int getNumOfNonWSCharacters(final String usrStr) {
		
		//uses regex replace all method to remove all whitespace and then
		//count the characters
		return usrStr.trim().replaceAll(" +", "").length();
	}
	
	//returns number of words minus whitespace
	public static int getNumOfWords(final String usrStr) {
		 
		
		String[] words = usrStr.split("\\s+"); //removes whitespace and stores into an array
		return words.length;
		
	}
	
	//replaces all exclamation points with periods
	public static String replaceExclamation(final String usrStr) {
		
		//uses regex replace all method to replace ! to .
        return usrStr.replaceAll("!", ".");
	}
	
	//removes excess spaces in a string
	public static String shortenSpace(final String usrStr) {
		
		//uses trim and replace all to find the excess spaces and then just replaces them with a single space
		return usrStr.trim().replaceAll(" +", " ");
		
	}
	
	public static int findText(String toFind, String usrStr) {
		int count = 0;
		
		//uses regex classes to find the word, no matter the case format and returns the number of times the 
		//word was uses
		Pattern p = Pattern.compile("\\b"+toFind+"\\b", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(usrStr);
		while(m.find()){
		    count++;
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		 
		 char menuChoice; // for the menu choice character
		 String input;// stores initial string to be passed into methods for use
		 String toFind; //stores word to be found, passes to method, and displays the word.
		 
		 System.out.println("Enter a sample text:");
		 input = scanner.nextLine();
		 System.out.println("You entered: " + input + "\n\n");
		 
		 do {
			 
			 System.out.println("Please Choose an option");
			 
			 menuChoice = printMenu(scanner);
			 
			 switch (menuChoice) {
			 
			 	case 'c':
			 		System.out.println("Number of non-whitespace character: " + getNumOfNonWSCharacters(input)+"\n");
			 		break;
			 		
			 	case 'w':
			 		System.out.println("Number of words: " + getNumOfWords(input)+"\n");
			 		break;
			 		
			 	case 'r':
			 		System.out.println("Sentence with ! replace with . : " + replaceExclamation(input)+"\n");
			 		break;
			 		
			 	case 's':
			 		System.out.println("Found more than one space and fixed it: " + shortenSpace(input)+"\n");
			 		break;
			 		
			 	case 'f':
			 		System.out.println("Enter a word or phase to be found: ");
			 		toFind = scanner.next();
			 		System.out.println("\""+toFind+"\"" + " Instances: " + findText(toFind, input)+"\n");
			 		break;
			 		
			 		
			 }
		 } while(menuChoice != 'q');	
		 
		 System.out.println("Goodbye");
	}
}

/*
Enter a sample text:
Hello, I am Dillan    Poorman. I do not wish harm on people, but MAN! People who drive    ten miles under the speed limit deserve a swift kick to the shin, man.
You entered: Hello, I am Dillan    Poorman. I do not wish harm on people, but MAN! People who drive    ten miles under the speed limit deserve a swift kick to the shin, man.


Please Choose an option
c - Number of non-whitespace characters
w - Number of words
f - Find text
r - Replace all !'s
s - Shorten spaces
q - Quit	
c
Number of non-whitespace character: 124

Please Choose an option
c - Number of non-whitespace characters
w - Number of words
f - Find text
r - Replace all !'s
s - Shorten spaces
q - Quit	
w
Number of words: 31

Please Choose an option
c - Number of non-whitespace characters
w - Number of words
f - Find text
r - Replace all !'s
s - Shorten spaces
q - Quit	
f
Enter a word or phase to be found: 
man
"man" Instances: 2

Please Choose an option
c - Number of non-whitespace characters
w - Number of words
f - Find text
r - Replace all !'s
s - Shorten spaces
q - Quit	
r
Sentence with ! replace with . : Hello, I am Dillan    Poorman. I do not wish harm on people, but MAN. People who drive    ten miles under the speed limit deserve a swift kick to the shin, man.

Please Choose an option
c - Number of non-whitespace characters
w - Number of words
f - Find text
r - Replace all !'s
s - Shorten spaces
q - Quit	
f
Enter a word or phase to be found: 
man
"man" Instances: 2

Please Choose an option
c - Number of non-whitespace characters
w - Number of words
f - Find text
r - Replace all !'s
s - Shorten spaces
q - Quit	
s
Found more than one space and fixed it: Hello, I am Dillan Poorman. I do not wish harm on people, but MAN! People who drive ten miles under the speed limit deserve a swift kick to the shin, man.

Please Choose an option
c - Number of non-whitespace characters
w - Number of words
f - Find text
r - Replace all !'s
s - Shorten spaces
q - Quit	
q
Goodbye
*/
