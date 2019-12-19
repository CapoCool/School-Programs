package queue_operations;

import java.util.Iterator;

import java.util.Scanner;

import linked_list_stack.LinkedStack;
/**
 * 
 * @author Dillan Poorman
 * CSC205
 * 11/15/2019
 * Driver classes for stacks and queues palindrome.
 *
 */

/* Test:
 * Enter a string to see if it's a palindrome
	palindrome
	emordnilap
 * 
 * Enter a string to see if it's a palindrome
	racecar
	The String is a palindrome
 * 
 * 
 */
public class PalindromeTester {
	
	
	static LinkedStack<String> stack = new LinkedStack<>();
	static Queue<String> queue = new Queue<>();
	
	/**
	 * @param User input from main method. A string to compare in a stack and queue.
	 * @return true is there is a palindrome. Returns false otherwise
	 * 
	 */
	
	static boolean isPalindrome(String str) {
		
		//declarations for turning stack and queue to an string of character list
		String str1 = str.replaceAll("[^a-zA-Z0-9]", ""); //removes special characters since palindromes won't show
		String s; //used to keep string character to push and queue
		String queueVar = ""; //string variable for dequeue
		String stackVar = ""; //string variable for pop
		
		//takes var s, makes it equal to the character at x index and pushed and queues it
		for(int i = 0; i < str1.length(); i++) {
			s = "" + str1.toLowerCase().charAt(i);
			stack.push(s);
			queue.enqueue(s);
			
		}
		
		//pops and dequeues in LIFO and FIFO for comparison.
		while(!queue.isEmpty()) {
			
			queueVar += queue.dequeue();
			stackVar += stack.pop(); 
		}
		
		//if false, it pushes the string back into the stack so the program
		//can later pop it to reverse the string.
		if (!queueVar.equals(stackVar)) {
			
			for(int i = 0; i < str.length(); i++) {
				s = "" + str.charAt(i);
				stack.push(s);
			}
			return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string to see if it's a palindrome");
		str = scan.nextLine();
		
		if(isPalindrome(str)) {
			System.out.println("The String is a palindrome");
		} 
		else { 
			while(!stack.isEmpty()) {
				System.out.print(stack.pop());
				
				}
			}
		
	}

}
