package stack_operations;
import java.util.*;

import java.io.*;
/**
 * 
 * @author Dilshad Haleem
 * This program display the maximum number stored
 * in a stack. It uses Collections.max method
 * that took O(n) operations in oreder to find the maximum
 * number on the stack, where n is the 
 * size of the Stack. 
 * <p>
 * output:
 *How many queries: 
 *3
 *push 6
 *push 2
 *max
 *6
 *
 */

public class StackWithMaxNaive{
	
	static public void main(String[] args) throws IOException {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many queries: ");
		int queries = scan.nextInt();
		//creating a stack  to store integers
		Stack2 stack = new Stack2();
        
		for (int qi = 0; qi < queries; ++qi) {
			String operation = scan.next(); 
			if ("push".equals(operation)) {
				int value = scan.nextInt();
				stack.push(value);
			} else if ("pop".equals(operation)) {
				stack.pop();
			} else if ("max".equals(operation)) {
				System.out.println(stack.getMax());
			}
		}
	
	}

	
}