package linked_list_stack;

import java.util.Iterator;
import java.util.stream.Stream;
/**
 * @author 
 */
/**
 * Driver for LinkedStack
 * <p>
 * Output should be as follows if you follow the instructions accurately
 * <p>
 * <pre>
 *     6 5 4 1 2 3
 *     6 5 4 1 2 3
 *     2 3
 *     2 2
 *     3
 * </pre>
 */

public class Module9ProjectDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 LinkedStack<Integer> stack = new LinkedStack<>();
		 Iterator<Integer> itr = stack.iterator();

	        stack.push(3);
	        stack.push(2);
	        stack.push(1);
	        stack.push(4);
	        stack.push(5);
	        stack.push(6);

	        // use forEach method to display contents
	        
	        for(Integer e : stack) {
	        	System.out.print(e);
	        }
	      
	        System.out.println();

	        // below use an explicit iterator to iterate over
	        //the stack and display its elements
	       
	        for(Iterator<Integer> i = stack.iterator(); i.hasNext();) {
				
				System.out.print(i.next());
			}

	        
	        
	        System.out.println();
           //Below perform 4 pop operations
	        stack.pop();
	        stack.pop();
	        stack.pop();
	        stack.pop();
	        
	        
	     // use forEach method to display contents
	        
	        for(Integer e : stack) {
	        	System.out.print(e);
	        }
	        
	        
	        
	        System.out.println();

	        //invoke a peek operations and then a pop. Make sure to 
	        //display the elements
	        System.out.print(stack.peek());
	        System.out.print(stack.peek() + "\n");
	        stack.pop();
	        
           //Use below a forEach loop  to display stack
	      
	        for(Integer e : stack) {
	        	System.out.print(e);
	        }
	        
	        

	        System.out.println();

	    }

}