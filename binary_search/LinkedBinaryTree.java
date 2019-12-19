package binary_search;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedBinaryTree<T> implements BinaryTreeADT<T> {

	protected BinaryTreeNode<T> root;
	protected int count;

	public LinkedBinaryTree() {
		this.root = null;
		this.count = 0;
	}
	
	 /**
     * NEW Creates a binary tree with the specified element as its root.
     *
     * @param element the element that will become the root of the binary tree
     */
    public LinkedBinaryTree(T element) 
    {
        root = new BinaryTreeNode<T>(element);
    }
    
    /**
     * NEW Creates a LinkedBinaryTree from the node passed to it.
     * 
     * @param node
     */
    protected LinkedBinaryTree(BinaryTreeNode<T> node) {
    	root = node;
    }


	@Override
	public T getRootElement() {

		// TODO complete the body
		if (root == null)
			throw new EmptyCollectionException("LinkedBinaryTree");
		return root.element; // the calling method is responsible for dealing with an empty tree
	}

	@Override
	public boolean isEmpty() {

		// TODO complete the body
		return root == null;
	}

	@Override
	public int size() {
		// TODO complete the body

		return count;
	}

	@Override
	public boolean contains(T targetElement) {

		// TODO in demo
		T temp;
		boolean found = false;

		try {
			temp = find(targetElement);
			found = true;
		} catch (Exception ElementNotFoundException) {
			found = false;
		}

		return found;

	}
	 /**
     * NEW Returns a reference to the node at the root
     *
     * @return a reference to the specified node
     * @throws EmptyCollectionException if the tree is empty
     */
    protected BinaryTreeNode<T> getRootNode() throws EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionException("binary tree");    
    
        return this.root;    
        }

	/**
	 * Returns a reference to the specified target element if it is found in this
	 * binary tree. Throws a ElementNotFoundException if the specified target
	 * element is not found in the binary tree.
	 *
	 * @param targetElement
	 *            the element being sought in this tree
	 * @return a reference to the specified target
	 * @throws ElementNotFoundException
	 *             if the element is not in the tree
	 */
	public T find(T targetElement) throws ElementNotFoundException {

		// TODO in demo
		BinaryTreeNode<T> current = findNode(targetElement, root);

		if (current == null)
			throw new ElementNotFoundException("LinkedBinaryTree");

		return (current.element);

	}

	/**
	 * Returns a reference to the specified target element if it is found in this
	 * binary tree.
	 * <p>
	 * Performance is O(n) because we have to search all nodes.
	 *
	 * @param targetElement
	 *            the element being sought in this tree
	 * @param next
	 *            the element to begin searching from
	 */
	private BinaryTreeNode<T> findNode(T targetElement, BinaryTreeNode<T> next) {
		// TODO in Demo

		if (next == null)
			return null;

		if (next.element.equals(targetElement))
			return next;

		BinaryTreeNode<T> temp = findNode(targetElement, next.left);

		if (temp == null)
			temp = findNode(targetElement, next.right);

		return temp;

	}
	/**
	 * Returns an iterator over the elements in this tree using the 
	 * iteratorLevelOrder method
	 *
	 * @return an in order iterator over this binary tree
	 */

	@Override
	public Iterator<T> iterator() {
		return iteratorLevelOrder();

	}

	@Override
	public Iterator<T> iteratorInOrder() {

		Queue<T> tempList = new LinkedList<>();
		inOrder(root, tempList);

		return tempList.iterator();
	}

	/**
	 * Performs a recursive inorder traversal.
	 *
	 * @param node
	 *            the node to be used as the root for this traversal
	 * @param tempList
	 *            the temporary list for use in this traversal
	 */
	protected void inOrder(BinaryTreeNode<T> node, Queue<T> tempList) {

		// TODO in class Demo
		if (node != null)
		{
			inOrder(node.left, tempList);
			tempList.add(node.element);
			inOrder(node.right, tempList);
		}


	}

	@Override
	public Iterator<T> iteratorPreOrder() {

		// TODO in class activity
		Queue<T> tempList = new LinkedList<>();
		preOrder(root, tempList);

		return tempList.iterator();


	}

	/**
	 * Performs a recursive preOrder traversal.
	 *
	 * @param node
	 *            the node to be used as the root for this traversal
	 * @param tempList
	 *            the temporary list for use in this traversal
	 */
	protected void preOrder(BinaryTreeNode<T> node, Queue<T> tempList) {

		// TODO in class activity
		if (node != null)
        {
            tempList.add(node.element);
            preOrder(node.left, tempList);
            preOrder(node.right, tempList);
        }


	}

	@Override
	public Iterator<T> iteratorPostOrder() {

		// TODO in class activity
		Queue<T> tempList = new LinkedList<>();
		postOrder(root, tempList);

		return tempList.iterator();

	}

	/**
	 * Performs a recursive postOrder traversal.
	 *
	 * @param node
	 *            the node to be used as the root for this traversal
	 * @param tempList
	 *            the temporary list for use in this traversal
	 */
	protected void postOrder(BinaryTreeNode<T> node, Queue<T> tempList) {

		// TODO in class activity
		if (node != null)
        {
            postOrder(node.left, tempList);
            postOrder(node.right, tempList);
            tempList.add(node.element);
        }

	}

	@Override
	public Iterator<T> iteratorLevelOrder() {

		// TODO in Demo
		Queue<T> tempQ = new LinkedList<>();
		levelOrder(root, tempQ);

		return tempQ.iterator();

	}

	/**
	 * Performs an iterative levelOrder traversal.
	 *
	 * @param node
	 * @param tempList
	 *            This method could be in itereatorLevelOrder since it is non
	 *            recursive but in order to be consistent its is broken down
	 */
	public void levelOrder(BinaryTreeNode<T> node, Queue<T> tempQ) {

		// TODO in demo
		if (node != null) {// ADDED Later - Tree is empty
			Queue<BinaryTreeNode<T>> queue = new LinkedList<>();

			queue.add(node);
			while (!queue.isEmpty()) {
				BinaryTreeNode<T> tempNode = queue.poll();
				tempQ.add(tempNode.element);

				if (tempNode.left != null) {
					queue.add(tempNode.left);
				}

				if (tempNode.right != null) {
					queue.add(tempNode.right);
				}
			}
		}
	}

	/**
	 * insert a node into the binary tree using level order insertion Note that
	 * nodes are added in level order as they arrive. It calls levelOrderInsertionIterator
	 * the returns a Queue with nodes inserted in the level order. 
	 * Check each node for null element if found insert the element 
	 * create a new null node and break out of the loop. Can be written
	 * without the break using a boolean variable  
	 * @param element
	 */
	public void insert(T element) {

		Queue<BinaryTreeNode<T>> tempQ = new LinkedList<>();
		boolean nodeIn = false;
		// see if Tree is empty
		if (this.root == null) {
			this.root = new BinaryTreeNode(element);
			count++;
		} else {
			Iterator<BinaryTreeNode<T>> iterator = levelOrderInsertionIterator(root, tempQ);

			while (iterator.hasNext() && !nodeIn) {

				BinaryTreeNode<T> node = iterator.next();
				if (node.left == null) {	
					node.left = new BinaryTreeNode(element);
					nodeIn = true;
				}
				else if(node.right == null) {
					    node.right = new BinaryTreeNode(element);
					    nodeIn = true;
				}
					
			}
			count++;
		 }
		

	
	}


	/**
	 * Performs an iterative levelOrder insertion of the tree nodes. 
	 * Then returns the iterator on the Queue
	 *
	 * @param node
	 * @param tempList
	 */
	private Iterator<BinaryTreeNode<T>> levelOrderInsertionIterator(BinaryTreeNode<T> node,
			Queue<BinaryTreeNode<T>> tempQ) {

		Queue<BinaryTreeNode<T>> queue = new LinkedList<>();
		queue.add(node);
		while (!queue.isEmpty()) {
			BinaryTreeNode<T> tempNode = queue.poll();
			tempQ.add(tempNode);

			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}

			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}

		}
		// TODO in Demo
		return tempQ.iterator();
	}

	

	/**
	 * Basic generic BinaryTreeNode class
	 *protected now so that the LinkedBinarySearchTree can access it. 
	 */
	protected class BinaryTreeNode<T> {  

		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		T element;

		BinaryTreeNode() {
			this.left = null;
			this.right = null;
			this.element = null;
		}

		BinaryTreeNode(T element) {
			this.element = element;
			this.left = null;
			this.right = null;
		}

		/**
		 * 
		 * Methods below are not needed now since it is a private class of
		 * LinkedBinaryTree
		 *
		T getElement() {
			return this.element;
		}

		BinaryTreeNode<T> getLeft() {
			return this.left;
		}

		BinaryTreeNode<T> getRight() {
			return this.right;
		}
        */
	}

}