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
	
	
}
