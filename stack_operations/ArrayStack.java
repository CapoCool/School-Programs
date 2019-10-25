package stack_operations;

/**
 * @author 
 * @author Dilshad
 * This class implements the StackADT <T> interface and by doing so
 * provides the implementation of all of StackADT <T> methods
 * This class represents a Stack Collection
 *
 * @param <T>
 */

public class ArrayStack<T>  {

	T[] stack;  
	int top;
	private static final int INITIAL_CAPACITY = 16;
	
	public ArrayStack() {
		
		stack = (T[]) (new Object[ArrayStack.INITIAL_CAPACITY]);
		top = 0;
	}

	
	


}
