package stack_operations;

/*
 * Dillan Poorman
 * CSC205
 * 10/25/2019
 * Generic stack class
 */

import java.util.Arrays;

public class Stack<T> implements StackADT<T> {

	T[] stack;
	private int stackSize;
	
	//sets stack to empty
	private int topOfStack = -1;
	
	public Stack (int size) {
		this.stackSize = size;
		stack = (T[]) new Object[size];
		
		Arrays.fill(stack, "-1");
	}
	
	@Override
	public void push(T element) {
		// TODO Auto-generated method stub
		try {
			
		
			if(this.topOfStack + 1 < this.stackSize) {
			
				this.topOfStack++;
			
				stack[topOfStack] = element;
				
				displayStack();
				
				System.out.println("PUSH" + element + " was added to the stack");
			
			}
			else {
				throw new FullCollectionException(this.stackSize);
			}
			
		}
		catch(FullCollectionException e) {
			
			System.out.println("Error -" + e);
		}
		
		displayStack();
	}
	
	//push many, except I cast everything to T when pushed into the stack
	public void pushMany(String multiValues) {
		
		String[] tempString = multiValues.split(" ");
		for(int i = 0; i < tempString.length; i++) {
			push((T) tempString[i]);
		}
		
	}

	public T pop() {
		// TODO Auto-generated method stub
		try {
			
			if(topOfStack >=0) {
				System.out.println("POP" + stack[topOfStack] + " was removed");
				stack[topOfStack] = (T) "-1";
				displayStack();
				return stack[topOfStack--];
			}
			else {
				displayStack();
				throw new EmptyCollectionException();
				//return (T) "-1";
			}
		}
		catch(EmptyCollectionException e) {
			System.out.println("Error - " + e);
			return (T) "-1";
		}
		
	}

	public T peek() {
		// TODO Auto-generated method stub
		displayStack();
		System.out.println("PEEK" + stack[topOfStack] + " is at the top of the stack");
		
		return stack[topOfStack];
	}

	public void displayStack() {
		for(int n = 0; n < 61; n++) {
			System.out.print("-");
		}
		
		System.out.println();
		
		for(int n = 0; n < this.stackSize; n++) {
			System.out.format("| %2s " + " ", n);
		}
		
		System.out.println("|");
		
		for(int n = 0; n < stackSize; n++) {
			System.out.print("-");
		}
		
		System.out.println();
		
		for(int n = 0; n < stackSize; n++) {
			
			if(stack[n].equals("-1")) {
				System.out.print("|    ");
			}
			else {
				System.out.print(String.format("| %2s " + " ", stack[n]));
			}
		}
		
		System.out.println("|");
		
		for(int n = 0; n < 61; n++) {
			System.out.print("-");
		}
		
		System.out.println();
		
	}

}
