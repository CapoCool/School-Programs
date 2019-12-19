package linked_list_stack;

import java.util.Scanner;
import java.util.Iterator;
/*
 * Dillan Poorman
 * CSC205
 * 11/3/2019
 * Driver class for linked list stack
 */

public class LinkedStackTester {
	
	static LinkedStack<Character> stack = new LinkedStack<>();
	static LinkedStack<Integer> intStack = new LinkedStack<>();
	
		
	public static void main(String[] args) {
		
		String str;
		char letters;
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Type a sentence you want to print backwards");
		str = scan.nextLine();
		
		char [] ch = str.toCharArray();
		for(char a : ch) {
			stack.push(a);
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
		
		System.out.println("\n\n");
		
		intStack.push(3);
		intStack.push(5);
		intStack.push(6);
		intStack.push(9);
		intStack.push(1);
		intStack.push(3);
		intStack.push(8);
		intStack.push(7);
		
		for(Iterator<Integer> i = intStack.iterator(); i.hasNext();) {
			
			System.out.print(i.next());
		}


	}
}
