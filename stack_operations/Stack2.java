package stack_operations;
import java.util.Stack;

/*
 * Dillan Poorman
 * CSC205
 * 10/25/2019
 * This class makes a stack and keeps track of max, while keeping both space and time complexity
 * to O(1)
 */

public class Stack2 {
	
	Stack<Integer> stack = new Stack<Integer>();
	private int maxEle;
	
	public int getMax() {
		try {

			if(stack.empty()) {
				throw new EmptyCollectionException();
			}
			else {
				return this.maxEle;
			}
		}
		catch(EmptyCollectionException e){
			System.out.println("Error - " + e);
		}
		return maxEle;
	}
	
	public void peek() {
		
		try {
			
			if(stack.empty()) {
				throw new EmptyCollectionException();
			}
			else {
				int t = stack.peek();
				
				if(t > this.maxEle) {
					System.out.print(this.maxEle);
				}
				else {
					System.out.print(t);
				}
			}
		}
		catch(EmptyCollectionException e) {
			System.out.println("Error - No more elements");
		}
		
	
	}
	
	public void pop() {
		try {
			if(stack.empty()) {
				throw new EmptyCollectionException();
			}
			else {
				int t = stack.peek();
				stack.pop();
				if(t > this.maxEle) {
					this.maxEle = 2 * maxEle - t;
				}
			}
		}
		catch(EmptyCollectionException e) {
			System.out.println("Error - No more elements");
		}
	}
	
	public void push(int x) {
		
		if (stack.empty())  
        { 
            maxEle = x; 
            stack.push(x); 
            return; 
        }
  
        // If new number is less than maxEle 
        if (x > maxEle)  
        { 
            stack.push(2 * x - maxEle); 
            maxEle = x; 
        } 
  
        else
            stack.push(x); 
    }
	

}
