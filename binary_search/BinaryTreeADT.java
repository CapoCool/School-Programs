package binary_search;
//Dillan Poorman
//CSC205
//12/14/2019
//Binary TreeADT 
import java.util.Iterator;

public interface BinaryTreeADT<T> {
	
	//returns a reference to the root element
	public T getRootElement();
	
	//checks to see if binary tree is empty
	public boolean isEmpty();
	
	//returns the number of elements in the binary tree
	public int size();
	
	//returns true if binary tree has the specified element
	public boolean contains(T t);
	
	//returns the reference to a specifice elements
	public T find(T t) throws ElementNotFoundException;
	
	//returns an iterator over the elements of this tree
	public Iterator<T> iterator();
	
	//returns an iterator that represents an inorder traversal on this binary tree
	public Iterator<T> iteratorInOrder();
	
	//returns an iterator that represent a preorder traversal on this binary tree
	public Iterator<T> iteratorPreOrder();
	
	//returns an iterator that represents a post order traversal on this binary tree
	public Iterator<T> iteratorPostOrder();
	
	//returns an iterator that represent a levelorder traversal on the binary tree
	public Iterator<T> iteratorLevelOrder();
	

}
