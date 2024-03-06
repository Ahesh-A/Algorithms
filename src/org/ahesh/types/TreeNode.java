package org.ahesh.types;

public class TreeNode<T> {
	private T value;
	private TreeNode<T> left;
	private TreeNode<T> right;
	private TreeNode<T> parent;

	public TreeNode() {
		this.value = null;
		this.left = null;
		this.right = null;
		this.parent = null;
	}
	
	public TreeNode(T value) {
		this.value = value;
		this.left = null;
		this.right = null;
		this.parent = null;
	}
	
	public TreeNode(T value, TreeNode<T> left, TreeNode<T> right, TreeNode<T> parent) {
		this.value = value;
		this.left = left;
		this.right = right;
		this.parent = parent;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public TreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}

	public TreeNode<T> getRight() {
		return right;
	}

	public void setRight(TreeNode<T> right) {
		this.right = right;
	}
	
	
}
