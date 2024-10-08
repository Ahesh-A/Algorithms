package myds.redblacktree;

import org.ahesh.types.RBNode;
import org.ahesh.types.Color;

public class RBTree<T extends Comparable<T>> {
	private RBNode<T> root;
	private final RBNode<T> nil = generateNil();
	
	
	public RBTree(RBNode<T> root) {
		super();
		this.root = root;
	}

	public RBTree(T[] arr) throws Exception {
		
		for(T element : arr) {
			RBNode<T> node = new RBNode<>();
			node.setKey(element);
			node.setLeft(nil);
			node.setRight(nil);
			node.setParent(nil);
			RBTUtils.insert(this, node);
		}
	}
	
	private RBNode<T> generateNil() {
		if(this.nil != null) return nil;
		
		RBNode<T> rbNode = new RBNode<>();
		rbNode.setColor(Color.BLACK);
		return rbNode;
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
