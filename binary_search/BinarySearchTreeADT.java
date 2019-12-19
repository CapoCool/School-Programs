package binary_search;
//Dillan Poorman
//CSC205
//12/14/2019
//BinarySearchTreeADT
public interface BinarySearchTreeADT<T> extends BinaryTreeADT<T> {
	
	//add an elements to the correct location on the tree
	public void addElement(T t);
	
	//removes and returns a specific element from the tree
	public T removeElement(T t) throws ElementNotFoundException;
	
	//removes all occurrences of a specified element from a tree
	public void removeAllOccurrences(T t) throws ElementNotFoundException;
	
	//removes and returns the smallest element from the tree
	public T removeMin();
	
	//removes and returns the largest element from the tree
	public T removeMax();
	
	//finds the minimum value without removing it
	public T findMin();
	
	//finds the max value without removing it
	public T findMax();

}
