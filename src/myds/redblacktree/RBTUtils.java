package myds.redblacktree;

import java.util.LinkedList;
import java.util.Queue;
import org.ahesh.types.Color;
import org.ahesh.types.RBNode;

public class RBTUtils {
	
	private static <T extends Comparable<T>> RBNode<T> navigateX(RBNode<T> x, RBNode<T> node) {
		if(x == null) {
			
		}
		
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
	
	private static <T extends Comparable<T>> void insertChildToQueue(Queue<RBNode<T>> queue, RBNode<T> node, RBNode<T> nil) {
		
		RBNode<T> leftChild = node.getLeft();
		RBNode<T> rightChild = node.getRight();
		
		if(leftChild != nil) {
			queue.offer(node.getLeft());
		}
		
		if(rightChild != nil) {
			queue.offer(rightChild);
		}
		
	}
	
	public static <T extends Comparable<T>> void  insert(RBTree<T> tree, RBNode<T> node) throws Exception{
		RBNode<T> y = tree.getNil();
		RBNode<T> x = tree.getRoot();
		
		if(x == null) {
			tree.setRoot(node);
			node.setLeft(y);
			node.setParent(y);
			node.setRight(y);
			node.setColor(Color.BLACK);
			return;
		}
			
		while(x != tree.getNil()) {
			y = x;
			x = navigateX(x, node);
		}
		
		node.setParent(y);
		
		setY(tree, y, node);
		
		setDefaultRBNode(tree, node);
		
		rbInsertFixUp(tree, node);
	}
	
	public static <T extends Comparable<T>> void rbInsertFixUp(RBTree<T> tree, RBNode<T> node) throws Exception{
		
		while(node.getParent().getColor() == Color.RED) {
			
			if(isLeftChild(node.getParent())) {
				RBNode<T> grandParent = node.getParent().getParent();
				RBNode<T> y = grandParent.getRight();
				
				if(y.getColor() == Color.RED) {
					node.getParent().setColor(Color.BLACK);
					y.setColor(Color.BLACK);
					grandParent.setColor(Color.RED);
					node = grandParent;
				} else {
					if(isRightChild(node)) {
						node = node.getParent();
						rotateLeft(tree, node);
					}
					node.getParent().setColor(Color.BLACK);
					node.getParent().getParent().setColor(Color.RED);
					rotateRight(tree, node.getParent().getParent());
				}
			} else {
				
				RBNode<T> y = node.getParent().getParent().getLeft();
					
				if(y.getColor() == Color.RED) {
					node.getParent().setColor(Color.BLACK);
					y.setColor(Color.BLACK);
					node.getParent().getParent().setColor(Color.RED);
					node = node.getParent().getParent();
				} else {
					if(isLeftChild(node)) {
						node = node.getParent();
						rotateRight(tree, node);
					}
					
					node.getParent().setColor(Color.BLACK);
					node.getParent().getParent().setColor(Color.RED);
					rotateLeft(tree, node.getParent().getParent());
				}	
			}
		}
		
		tree.getRoot().setColor(Color.BLACK);
	}
	
	public static <T extends Comparable<T>> void bfsRbTree(RBTree<T> tree) {
		Queue<RBNode<T>> queue = new LinkedList<>();
		queue.offer(tree.getRoot());
		
		while(!queue.isEmpty()) {
			RBNode<T> node = queue.poll();
	
			insertChildToQueue(queue, node, tree.getNil());
			System.out.print(node + " ");
		}
	}
	
}
