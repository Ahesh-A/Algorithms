package myds.rbt;

import org.ahesh.types.RBNode;

public class RBTree<T extends Comparable<T>> {
	private RBNode<T> root;
	private final RBNode<T> nil = new RBNode<>();
	
	public RBTree(RBNode<T> root) {
		super();
		this.root = root;
		
	}
	
	public RBTree(RBNode<T>[] arr) {
		
		for(RBNode<T> node: arr) {
			RBTUtils.insert(this, node);
		}
	}

	public RBNode<T> getRoot() {
		return root;
	}
	
	public void setRoot(RBNode<T> root) {
		this.root = root;
	}
	
	public RBNode<T> getNil() {
		return nil;
	}
}
