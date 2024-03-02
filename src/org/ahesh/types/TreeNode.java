package org.ahesh.types;

public class TreeNode<T> {
	private T value;
	private TreeNode<T> left;
	private TreeNode<T> right;
		
	TreeNode() {
		this.value = null;
		this.left = null;
		this.right = null;
	}
	
	TreeNode(T value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	TreeNode(T value, TreeNode<T> left, TreeNode<T> right) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	
}
