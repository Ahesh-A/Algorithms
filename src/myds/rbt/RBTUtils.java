package myds.rbt;

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
		
//		RBInsertFixUP();
	}
}
