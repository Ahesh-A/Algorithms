package org.ahesh.types;

public class RBNode<T> {
	private Color color;
	private T key;
	private RBNode<T> parent;
	private RBNode<T> left;
	private RBNode<T> right;
	
	public RBNode() {}
	
	public RBNode(Color color, T key, RBNode<T> parent, RBNode<T> left, RBNode<T> right) {
		this.color = color;
		this.key = key;
		this.parent = parent;
		this.left = left;
		this.right = right;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	public RBNode<T> getParent() {
		return parent;
	}

	public void setParent(RBNode<T> parent) {
		this.parent = parent;
	}

	public RBNode<T> getLeft() {
		return left;
	}

	public void setLeft(RBNode<T> left) {
		this.left = left;
	}

	public RBNode<T> getRight() {
		return right;
	}

	public void setRight(RBNode<T> right) {
		this.right = right;
	}
	
}
