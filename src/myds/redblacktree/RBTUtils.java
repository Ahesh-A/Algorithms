package myds.redblacktree;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import org.ahesh.types.Color;
import org.ahesh.types.RBNode;

public class RBTUtils {
	
	private static <T extends Comparable<T>> RBNode<T> navigateX(RBNode<T> x, RBNode<T> node) {
		
		if(node.compareTo(x.getKey()) < 0) {
			return x.getLeft();
		}
		
		return x.getRight();
	}
	
	private static <T extends Comparable<T>> void setY(RBTree<T>tree, RBNode<T> y, RBNode<T> node) {
		
		if(y == tree.getNil()) {
			tree.setRoot(node);
			return;
		}
		
		if(node.compareTo(y.getKey()) < 0) {
			y.setLeft(node);
			return;
		}
		
		y.setRight(node);
	}
	
	private static <T extends Comparable<T>> void setDefaultRBNode(RBTree<T> tree, RBNode<T> node) {
		node.setColor(Color.RED);
		node.setLeft(tree.getNil());
		node.setRight(tree.getNil());
	}
	
	private static <T extends Comparable<T>> boolean isLeftChild(RBNode<T> node) {
		
		return node == node.getParent().getLeft();
	}
	

	private static <T extends Comparable<T>> boolean isRightChild(RBNode<T> node) {
		
		return node == node.getParent().getRight();
	}
	
	private static <T extends Comparable<T>> void replaceChildXWithY(RBNode<T> x, RBNode<T> y) {
		if(isLeftChild(x)) {
			x.getParent().setLeft(y);
			return;
		}
		
		x.getParent().setRight(y);
	}
	
	private static <T extends Comparable<T>> void navigateYAsSubRoot(RBTree<T> tree, RBNode<T> node, RBNode<T> y) {
		if(node.getParent() == tree.getNil()) {
			tree.setRoot(y);
			return;
		} 
		
		replaceChildXWithY(node, y);
		
	}
	
	private static <T extends Comparable<T>> void rotateLeft(RBTree<T> tree, RBNode<T> node) throws Exception{
		if(node.getRight() == null) {
			throw new Exception("Not left rotatable");
		}
		
		RBNode<T> y = node.getRight();
		node.setRight(y.getLeft());
		
		if(y.getLeft() != null) {
			y.getLeft().setParent(node);
		}
		
		y.setParent(node.getParent());
		
		navigateYAsSubRoot(tree, node, y);
		
		
		y.setLeft(node);
		node.setParent(y);
		
	}
	
	private static  <T extends Comparable<T>> void rotateRight(RBTree<T> tree, RBNode<T> node) throws Exception{
		if(node.getLeft() == null) {
			throw new Exception("Not right rotatable");
		}
		
		RBNode<T> y = node.getLeft();
		node.setLeft(y.getRight());
		
		if(y.getRight() != null) {
			y.getRight().setParent(node);
		}
		
		y.setParent(node.getParent());
		
		navigateYAsSubRoot(tree, node, y);
		
		y.setRight(node);
		node.setParent(y);
		
	}
	
	public static <T extends Comparable<T>> void  insert(RBTree<T> tree, RBNode<T> node) {
		RBNode<T> y = tree.getNil();
		RBNode<T> x = tree.getRoot();
		
		while(x != tree.getNil()) {
			y = x;
			x = navigateX(x, node);
		}
		
		node.setParent(y);
		
		setY(tree, y, node);
		
		setDefaultRBNode(tree, node);
		
//		rbInsertFixUp();
	}
	
	private static <T extends Comparable<T>> RBNode<T> getUncle(RBNode<T> node) {
		RBNode<T> parent = node.getParent();
		if(isLeftChild(parent)) {
			return parent.getParent().getRight();
		}
		
		return parent.getParent().getLeft();
	}
	
	private static <T extends Comparable<T>> void fixLeftSubTree(RBTree<T> tree, RBNode<T> node) {
		
	}
	
	private static <T extends Comparable<T>> void fixRightSubTree(RBTree<T> tree, RBNode<T> node) {
		
	}
	
	public static <T extends Comparable<T>> void rbInsertFixUp(RBTree<T> tree, RBNode<T> node) {
		
		while(node.getParent().getColor() == Color.RED) {
			RBNode<T> uncle = getUncle(node);
			RBNode<T> parent = node.getParent();
			RBNode<T> grandParent = parent.getParent();
			
			if(isLeftChild(parent)) {
				fixLeftSubTree();
				continue;
			}
			
			fixRightSubTree(tree, node);
 			if(uncle.getColor() == Color.RED) {
				grandParent.setColor(Color.RED);
				parent.setColor(Color.BLACK);
				uncle.setColor(Color.BLACK);
				
				node = grandParent;
				continue;
			} 
			
			
			if(isRightChild(node)) {
				node = node.getParent();
				rotateLeft(tree, node);
			}
			
			parent = node.getParent();
			grandParent = parent.getParent();
			
			parent.setColor(Color.BLACK);
			grandParent.setColor(Color.RED);
			
			rotateRight(tree, grandParent);
		}
		
		tree.getRoot().setColor(Color.BLACK);
	}
}
