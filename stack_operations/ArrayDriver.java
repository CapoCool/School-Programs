package stack_operations;

/**Dillan Poorman
 * CSC205
 * 10/25/2019
 * Driver for stack class.
 *
 */

public class ArrayDriver {

	public static void main(String[] args) {

		
		Stack<Integer> stack = new Stack<>(10);
		
		stack.push(10);
		stack.push(15);
		stack.push(2);
		stack.push(10);
		
		stack.peek();
		
		stack.pushMany("20 31 65 55 2 1");
		
		stack.push(55);
		
		//I just wanted to see if the generic worked... it does.
		Stack<String> stack2 = new Stack<>(10);
		
		stack2.pushMany("1 2 3 4 5 6 7 8 9 10");
		
		
	

		

	}

}