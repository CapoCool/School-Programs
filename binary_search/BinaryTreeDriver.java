package binary_search;

import java.util.Iterator;
/*
 * Used By Dillan Poorman
 * CSC205
 * 12/14/2019
 * BinaryTreeDriverClass
 */
public class BinaryTreeDriver {

	public static void main(String[] args) throws ElementNotFoundException {
		// This is the driver we use for LinkedBinaryTree
		//Modify it as instructed in the Project document. 

		LinkedBinarySearchTree<Integer> binaryTree = new LinkedBinarySearchTree<>();

	
		binaryTree.addElement(0);
		binaryTree.addElement(0);
		binaryTree.addElement(1);
		binaryTree.addElement(2);
		binaryTree.addElement(3);
		binaryTree.addElement(4);
		binaryTree.addElement(5);
		binaryTree.addElement(6);
		binaryTree.addElement(7);
		binaryTree.addElement(8);
		binaryTree.addElement(9);
	
		
		Iterator<Integer> itr = binaryTree.iteratorLevelOrder();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println("\nNumber of nodes in binary tree are : " + binaryTree.size());
		System.out.println(binaryTree.getLeft());
		System.out.println(binaryTree.getRight());
		
		System.out.println("Min: " + binaryTree.findMin());
		System.out.println("Max: " + binaryTree.findMax());
		binaryTree.removeMax();
		binaryTree.removeMin();
		
		System.out.println("After Removing min");
		System.out.println(binaryTree.getLeft());
		System.out.println(binaryTree.getRight());
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

}
