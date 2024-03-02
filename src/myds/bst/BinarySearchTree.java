package myds.bst;

import org.ahesh.types.TreeNode;

public class BinarySearchTree<T> {
	private TreeNode<T> root;
	
	public BinarySearchTree(TreeNode<T> root) {
		this.root = root;
	}
	
	public BinarySearchTree(T[] arr) {
		this.root = new TreeNode<T> (arr[0]);
		
		for(int i = 1; i < arr.length; i++) {
			
		}
	}
}
