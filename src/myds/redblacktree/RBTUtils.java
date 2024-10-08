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
	
	public static <T extends Comparable<T>> RBNode<T> getLeftMostChild(RBTree<T> tree, RBNode<T> node) {
		RBNode<T> nil = tree.getNil();
		RBNode<T> y = node;
		
		while(node != nil) {
			y = node;
			node = node.getLeft();
		}
		
		return y;
	}
	
	public static <T extends Comparable<T>> RBNode<T> getSuccessor(RBTree<T> tree, RBNode<T> node) {
		
		RBNode<T> y = node;
		
		if(node.getRight() != tree.getNil()) {
			return getLeftMostChild(tree, node.getRight());
		}
		
		while(isRightChild(y) && y != tree.getNil()) {
			y = y.getParent();
		}
		
		return y.getParent();
	}
	
	public static <T extends Comparable<T>> RBNode<T> getPointerY(RBTree<T> tree, RBNode<T> node) {
		if(node.getLeft() == tree.getNil() || node.getRight() == tree.getNil()) {
			return  node;
		} 
		
		return getSuccessor(tree, node);
	}
	
	public static <T extends Comparable<T>> RBNode<T> getPointerX(RBNode<T> node, RBNode<T> nil) {
		if(node.getLeft() != nil) {
			return  node.getLeft();
		} 
		
		return node.getRight();
	}
	
	public static <T extends Comparable<T>> RBNode<T> delete(RBTree<T> tree, RBNode<T> node ) throws Exception {
		RBNode<T> nil = tree.getNil();
		RBNode<T> y = getPointerY(tree, node);
		RBNode<T> x = getPointerX(node, nil);
		
		x.setParent(y.getParent());
		
		if(y.getParent() == nil) {
			tree.setRoot(x);
		} else if(isLeftChild(x)) {
			y.getParent().setLeft(x);
		} else {
			y.getParent().setRight(x);
		}
		
		if(y != node) {
			node.setKey(y.getKey());
		}
		
		if(y.getColor() == Color.BLACK) {
			rbDeleteFixUp(tree, x);
		}
		
		return y;
	}
	
	public static <T extends Comparable<T>> void rbDeleteFixUp(RBTree<T> tree, RBNode<T> x) throws Exception {
		while(x != tree.getRoot() && x.getColor() == Color.BLACK) {
			if(isLeftChild(x)) {
				RBNode<T> w = x.getParent().getRight();
				if(w.getColor() == Color.RED) {
					w.setColor(Color.BLACK);
					x.getParent().setColor(Color.RED);
					rotateLeft(tree, x.getParent());
					w = x.getParent().getRight();
				}
				
				if(w.getLeft().getColor() == Color.BLACK && w.getRight().getColor() == Color.BLACK) {
					w.setColor(Color.RED);
					x = x.getParent();
				} else if(w.getRight().getColor() == Color.BLACK) {
					w.getLeft().setColor(Color.BLACK);
					w.setColor(Color.RED);
					rotateRight(tree, w);
					w = x.getParent().getRight();
				}
				
				w.setColor(x.getParent().getColor());
				x.getParent().setColor(Color.BLACK);
				rotateLeft(tree, x.getParent());
				x = tree.getRoot();
			} else {
				
			}
			
		}
		
		x.setColor(Color.BLACK);
	}
	
}
