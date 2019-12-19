package linked_list_stack;

import java.util.Iterator;
import java.util.NoSuchElementException;

import stack_operations.StackADT;

/* Dillan Poorman
 * CSC205
 * 11/2/2019
 * Linked stack class, made generic. Added exceptions and some extras, it's good to put in practice new
 * things you learn
 */


public class LinkedStack<Item> implements StackADT<Item>, Iterable<Item>  {
    private int n;          // size of the stack
    private Node first;     // top of stack

    // helper linked list class
    private class Node {
        private Item item;
        private Node next;
    }

    //initializes empty stack
    public LinkedStack() {
        first = null;
        n = 0;
    }

    //checks if stack is empty
    public boolean isEmpty() {
        return first == null;
    }

    //push method
    @Override
    public void push(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        n++;
    }
     

    //pop method
    public Item pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        Item item = first.item;        // save item to return
        first = first.next;            // delete first node
        n--;
        return item;                   // return the saved item
    }
    
    //iterator. This one took
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    // an iterator, doesn't implement remove() since it's optional
    private class ListIterator implements Iterator<Item> {
        private Node current = first;
        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next; 
            return item;
        }
    }


    /**
     * Returns (but does not remove) the item most recently added to this stack.
     * @return the item most recently added to this stack
     * @throws java.util.NoSuchElementException if this stack is empty
     */
    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return first.item;
    }
  

}

