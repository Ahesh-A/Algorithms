package myds.bst;

import org.ahesh.types.TreeNode;

public class BinarySearchTree<T extends Comparable<T>> {
	private TreeNode<T> root;
	
	public BinarySearchTree(TreeNode<T> root) {
		this.root = root;
	}
	
	public BinarySearchTree(T[] arr) throws Exception{
		this.root = new TreeNode<T> (arr[0]);
		this.root = BSTUtils.constructBST(arr);
	}

}
