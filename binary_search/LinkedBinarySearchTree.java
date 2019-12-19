package binary_search;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import com.sun.corba.se.impl.orbutil.graph.Node;

import binary_search.LinkedBinaryTree.BinaryTreeNode;

/**Used By Dillan Poorman
 * CSC205
 * 12/14/2019
 * LinkedBinarySearchTree implements the BinarySearchTreeADT interface with
 * links.
 * 
 * @author Java Foundations
 * @version 4.0
 */
public class LinkedBinarySearchTree<T> extends LinkedBinaryTree<T> implements BinarySearchTreeADT<T> {
	/**
	 * Creates an empty binary search tree.
	 */
	public LinkedBinarySearchTree() {
		super();
	}

	/**
	 * Creates a binary search with the specified element as its root.
	 *
	 * @param element
	 *            the element that will be the root of the new binary search tree
	 */
	public LinkedBinarySearchTree(T element) {
		super(element);

		if (!(element instanceof Comparable))
			throw new NonComparableElementException("LinkedBinarySearchTree");
	}

	/**
	 * Adds the specified object to the binary search tree in the appropriate
	 * position according to its natural order. Note that equal elements are added
	 * to the right. Recursive
	 *
	 * @param element
	 *            the element to be added to the binary search tree
	 */
	public void addElement(T element) {
		
		BinaryTreeNode<T> temp = new BinaryTreeNode<T> (element);
	      Comparable<T> comparableElement = (Comparable<T>)element;

	      if (isEmpty())
	         root = temp;
	      else 
	      {
	         BinaryTreeNode<T> current = root;
	         boolean added = false;

	         while (!added) 
	         {
	            if (comparableElement.compareTo(current.element) < 0)
	            {
	               if (current.left == null) 
	               {
	                  current.left = temp;
	                  added = true;
	               } 
	               else
	                  current = current.left;
	            }
	            else
	            {
	               if (current.right == null) 
	               {
	                  current.right = temp;
	                  added = true;
	               } 
	               else
	                  current = current.right;
	            }
	         }
	      }
	      
	      count++;
	}

	/**
	 * Adds the specified object to the binary search tree in the appropriate
	 * position according to its natural order. Note that equal elements are added
	 * to the right.
	 *
	 * @param element
	 *            the element to be added to the binary search tree
	 */
	private void addElement(T element, BinaryTreeNode<T> node) {
		Comparable<T> comparableElement = (Comparable<T>) element;
		
		if(comparableElement.compareTo(node.element) < 0) {
			if(node.left == null) {
				node.left = new BinaryTreeNode<T>(element);
			}
			else {
				addElement(element, node.left);
			}
		}
		else {
			if(node.right == null) {
				node.right = new BinaryTreeNode<T>(element);
			}
			else {
				addElement(element, node.right);
			}
		}
		//TODO in demo
	}

	/**
	 * Adds the specified object to the binary search tree in the
	 * appropriate position according to its natural order.  Note that
	 * this method will reject duplicate element. 
	 *This is iterative solution
	 * @param element the element to be added to the binary search tree
	 */

	
	public void insertIterative (T element)
	{
	
		if (!(element instanceof Comparable))
			throw new NonComparableElementException("LinkedBinarySearchTree");

		Comparable<T> comparableElement = (Comparable<T>)element;
		
		

		//TODO in demo
	}
	
	/**
	 * Removes the first element that matches the specified target element from the
	 * binary search tree and returns a reference to it. Throws a
	 * ElementNotFoundException if the specified target element is not found in the
	 * binary search tree.
	 *
	 * @param targetElement
	 *            the element being sought in the binary search tree
	 * @throws ElementNotFoundException
	 *             if the target element is not found
	 */
	public T removeElementIterative(T targetElement) throws ElementNotFoundException

	{
		T result = null;

	      if (!isEmpty())

	         if (((Comparable)targetElement).equals(root.element)) 
	         {
	            result =  root.element;
	            root = replacement (root);
	            count--;
	         } //if
	        else 
	        {
	            BinaryTreeNode<T> current, parent = root;
	            boolean found = false;

	            if (((Comparable)targetElement).compareTo(root.element) < 0)
	               current = root.left;
	            else
	               current = root.right;

	            while (current != null && !found) 
	            {
	               if (targetElement.equals(current.element)) 
	               {
	                  found = true;
	                  count--;
	                  result =  current.element;
	          
	                  if (current == parent.left)
	                  {
	                     parent.left = replacement (current);
	                  }
	                  else
	                  {
	                     parent.right = replacement (current);
	                  }
	               } //if
	              else 
	              {
	                  parent = current;
	         
	                  if (((Comparable)targetElement).compareTo(current.element) < 0)
	                     current = current.left;
	                  else
	                     current = current.right;
	               } //else
	            } //while
	            if (!found)
	               throw new ElementNotFoundException("binary tree");
	         } //else

	      return result;
		
	}

	/**
	 * Removes the first element that matches the specified target element from the
	 * binary search tree and returns a reference to it. Throws a
	 * ElementNotFoundException if the specified target element is not found in the
	 * binary search tree.
	 *
	 * @param targetElement
	 *            the element being sought in the binary search tree
	 * @throws ElementNotFoundException
	 *             if the target element is not found
	 */
	public T removeElement(T targetElement) throws ElementNotFoundException

	{
		T result = null;

		if (isEmpty())
			throw new ElementNotFoundException("LinkedBinarySearchTree");
		else {
			BinaryTreeNode<T> parent = null;
			if (((Comparable<T>) targetElement).equals(root.element)) {
				result = root.element;
				BinaryTreeNode<T> temp = replacement(root);
				if (temp == null)
					root = null;
				else {
					root.element = temp.element;
					root.right = temp.right;
					root.left = temp.left;
				}

				count--;
			} else {
				parent = root;
				if (((Comparable<T>) targetElement).compareTo(root.element) < 0)
					result = removeElement(targetElement, root.left, parent);
				else
					result = removeElement(targetElement, root.right, parent);
			}
		}

		return result;
	}

	/**
	 * Removes the first element that matches the specified target element from the
	 * binary search tree and returns a reference to it. Throws a
	 * ElementNotFoundException if the specified target element is not found in the
	 * binary search tree.
	 *
	 * @param targetElement
	 *            the element being sought in the binary search tree
	 * @param node
	 *            the node from which to search
	 * @param parent
	 *            the parent of the node from which to search
	 * @throws ElementNotFoundException
	 *             if the target element is not found
	 */
	private T removeElement(T targetElement, BinaryTreeNode<T> node, BinaryTreeNode<T> parent)
			throws ElementNotFoundException {
		T result = null;

		if (node == null)
			throw new ElementNotFoundException("LinkedBinarySearchTree");
		else {
			if (((Comparable<T>) targetElement).equals(node.element)) {
				result = node.element;
				BinaryTreeNode<T> temp = replacement(node);
				if (parent.right == node)
					parent.right = temp;
				else
					parent.left = temp;

				count--;
			} else {
				parent = node;
				if (((Comparable<T>) targetElement).compareTo(node.element) < 0)
					result = removeElement(targetElement, node.left, parent);
				else
					result = removeElement(targetElement, node.right, parent);
			}
		}

		return result;
	}

	/**
	 * Returns a reference to a node that will replace the one specified for
	 * removal. In the case where the removed node has two children, the inorder
	 * successor is used as its replacement.
	 *
	 * @param node
	 *            the node to be removed
	 * @return a reference to the replacing node
	 */
	private BinaryTreeNode<T> replacement(BinaryTreeNode<T> node) {
		BinaryTreeNode<T> result = null;

		if ((node.left == null) && (node.right == null))
			result = null;

		else if ((node.left != null) && (node.right == null))
			result = node.left;

		else if ((node.left == null) && (node.right != null))
			result = node.right;

		else {
			BinaryTreeNode<T> current = node.right;
			BinaryTreeNode<T> parent = node;

			while (current.left != null) {
				parent = current;
				current = current.left;
			}

			current.left = node.left;
			if (node.right != current) {
				parent.left = current.right;
				current.right = node.right;
			}

			result = current;
		}

		return result;
	}

	
	/**
	 * Removes the node with the least value from the binary search tree and returns
	 * a reference to its element. Throws an EmptyCollectionException if this tree
	 * is empty.
	 *
	 * @return a reference to the node with the least value
	 * @throws EmptyCollectionException
	 *             if the tree is empty
	 */
	public T removeMin() throws EmptyCollectionException {
		T result = null;

		if (isEmpty())
			throw new EmptyCollectionException("LinkedBinarySearchTree");
		else {
			if (root.left == null) {
				result = root.element;
				root = root.right;
			} else {
				BinaryTreeNode<T> parent = root;
				BinaryTreeNode<T> current = root.left;
				while (current.left != null) {
					parent = current;
					current = current.left;
				}
				result = current.element;
				parent.left = current.right;
			}

			count--;
		}

		return result;
	}
	/**
	 * Returns a string representation of this binary tree showing
	 * the nodes in an inorder fashion.
	 *
	 * @return a string representation of this binary tree
	 */
		public String toString() 
		{
		    Queue <T> tempList = new LinkedList<T>();
		    inOrder(root, tempList);
		    
		    return tempList.toString();
		}
	
	/*                                    Programming Project Starts Here
	 * 
	 *  
	 */
	
	
	/**
	 * Removes the node with the highest value from the binary search tree and
	 * returns a reference to its element. Throws an EmptyCollectionException if
	 * this tree is empty.
	 *
	 * @return a reference to the node with the highest value
	 * @throws EmptyCollectionException
	 *             if the tree is empty
	 */
	public T removeMax() throws EmptyCollectionException {
		 T result = null;

	      if (isEmpty())
	           throw new EmptyCollectionException ("binary tree");
	      else 
	      {
	         if (root.right == null) 
	         {
	            result =  root.element;
	            root = root.left;
	         } //if
	         else 
	         {
	              BinaryTreeNode<T> parent = root;
	              BinaryTreeNode<T> current = root.right;

	              while (current.right != null) 
	              {
	                 parent = current;
	                 current = current.right;
	              } //while

	              result =  current.element;
	              parent.right = current.left;
	           } //else

	         count--;
	      } //else

	      return result;
	}
	
	/**
	 * Removes elements that match the specified target element from the binary
	 * search tree. Throws a ElementNotFoundException if the specified target
	 * element is not found in this tree.
	 *
	 * @param targetElement
	 *            the element being sought in the binary search tree
	 * @throws ElementNotFoundException
	 *             if the target element is not found
	 */
	public void removeAllOccurrences(T targetElement) throws ElementNotFoundException {
		removeElement(targetElement);
		
		try {
			while(contains((T)targetElement)) {
				removeElement(targetElement);
			}
		}
		catch(Exception ElementNotFound) {
			
		}
		//TODO in prgramming Project
	}
	
	/**
	 * Search the tree in iterative manner and returns a reference to the specified 
	 * target element if it is found in this
	 * binary tree. Throws a ElementNotFoundException if the specified target
	 * element is not found in the binary tree.
	 *
	 * @param targetElement
	 *            the element being sought in this tree
	 * @return a reference to the specified target
	 * @throws ElementNotFoundException
	 *             if the element is not in the tree
	 */

	
	public T searchIterative(T targetElement) throws ElementNotFoundException {

		// TODO as a programming project
		
		
		
		return null; //temp

	}

	
	/**
	 * Returns the element with the least value in the binary search tree. It does
	 * not remove the node from the binary search tree. Throws an
	 * EmptyCollectionException if this tree is empty.
	 *
	 * @return the element with the least value
	 * @throws EmptyCollectionException
	 *             if the tree is empty
	 */
	public T findMin() throws EmptyCollectionException {
		// To be completed as a Programming Project
		T result = null;

	       if (isEmpty())
	            throw new EmptyCollectionException ("binary tree");
	       else 
	       {
	          BinaryTreeNode<T> current = root;
	         
	          while (current.left != null)
	             current = current.left;
	        
	          result = current.element;
	       } //else

	       return result;
	}

	/**
	 * Returns the element with the highest value in the binary search tree. It does
	 * not remove the node from the binary search tree. Throws an
	 * EmptyCollectionException if this tree is empty.
	 *
	 * @return the element with the highest value
	 * @throws EmptyCollectionException
	 *             if the tree is empty
	 */
	public T findMax() throws EmptyCollectionException {
		// To be completed as a Programming Project

		T result = null;

	       if (isEmpty())
	            throw new EmptyCollectionException ("binary tree");
	       else 
	       {
	          BinaryTreeNode<T> current = root;
	       
	          while (current.right != null) {
	        	  		current = current.right;
	            	 
	             }

	         result = current.element;
	       } //else
	  
	       return result;
	}

	/**
	 * Returns the left subtree of the root of this tree.
	 *
	 * @return a link to the left subtree of the tree
	 */
	public LinkedBinarySearchTree<T> getLeft() {
		// To be completed as a Programming Project

		if(root == null)
        	return null;
        
        LinkedBinarySearchTree<T> leftTree = new LinkedBinarySearchTree<T>();
        
        leftTree.root = root.left;
        				
        
        return leftTree;
	}

	/**
	 * Returns the right subtree of the root of this tree.
	 *
	 * @return a link to the right subtree of the tree
	 */
	public LinkedBinarySearchTree<T> getRight() {
		// To be completed as a Programming Project

		if(root == null)
        	return null;
        
        LinkedBinarySearchTree<T> rightTree = new LinkedBinarySearchTree<T>();
        
        rightTree.root = root.right;
        
        return rightTree;
	}




}