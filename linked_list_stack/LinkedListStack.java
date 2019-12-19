package linked_list_stack;
import static java.lang.System.exit;

public class LinkedListStack<Item>{
	
	//node for linked list
	private class Node {
		
		Item data; 
		Node link;
	}
	
	//globe top reference variable
	Node top;
	
	//constructor
	LinkedListStack() {
		
		this.top = null;
	}
	
	//function to add an element to the stack
	@SuppressWarnings("unused")
	public void push(Item item ) {
		
		//create new node temp and allocate memory
		Node temp = new Node();
		
		
		//checks to see if heap is full. Add exception for later
		if(temp == null) {
			System.out.print("\nHeap Overflow");
			return;
		}
			
			//initialize data into temp data fiel
			temp.data = item;
			
			//put top reference into temp link
			temp.link = top;
			
			//update top reference
			top = temp;
	}
	
	//checks to see if stack is empty
	public boolean isEmpty() {
		return top == null;
	}
	
	//function to return top element
	public Item peek() {
		if(!isEmpty()) {
			return top.data;
		}
		else {
			System.out.println("Stack is empty");
			return null;
		}
	}
	
	//pops element from stack
	public void pop() {
		
		if(top == null) {
			@SuppressWarnings("unchecked")
			Item item = (Item) top;
			System.out.print("\nStack Underflow");
			return;
		}
		
		top = (top).link;
	}
	
	//displays stack
	 public void display() {
		 if(top == null) {
			 System.out.printf("\nStack Underflow");
			 exit(1);
		 }
		 else {
			 Node temp = top;
			 while(temp != null) {
				 //print node data
				 System.out.print(temp.data);
				 
				 //assign temp link temp
				 temp = temp.link;
			 }
		 }
	 }
		
}


