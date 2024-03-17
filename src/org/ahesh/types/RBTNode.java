package org.ahesh.types;

public class RBTNode<T> {
	private Color color;
	private T key;
	private RBTNode<T> parent;
	private RBTNode<T> left;
	private RBTNode<T> right;
	
	public RBTNode() {}
	
	public RBTNode(Color color, T key, RBTNode<T> parent, RBTNode<T> left, RBTNode<T> right) {
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

	public RBTNode<T> getParent() {
		return parent;
	}

	public void setParent(RBTNode<T> parent) {
		this.parent = parent;
	}

	public RBTNode<T> getLeft() {
		return left;
	}

	public void setLeft(RBTNode<T> left) {
		this.left = left;
	}

	public RBTNode<T> getRight() {
		return right;
	}

	public void setRight(RBTNode<T> right) {
		this.right = right;
	}
	
}
