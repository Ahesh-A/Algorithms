package myds.bst;

import org.ahesh.types.TreeNode;

public class BSTUtils {
	
	private static <T extends Comparable<T>> void insertChild(TreeNode<T> parent, T element) {
		
		if(parent.getValue().compareTo(element) < 0 ) {
			parent.setRight(new TreeNode<T>(element));
			return;
		}
		
		parent.setLeft(new TreeNode<T>(element));
		return;
	}
	
	private static <T extends Comparable<T>> void insertHelper(TreeNode<T> root, TreeNode<T> parent, T element) {
		if(root == null) {
			insertChild(parent, element);
			return;
		}
		
		if(root.getValue().compareTo(element) < 0) {
			insertHelper(root.getRight(), root , element);
			return;
		}
		
		insertHelper(root.getLeft(), root, element);
	}
	
	public static <T extends Comparable<T>> void  insert(TreeNode<T> root, T element) throws Exception{
		if (root == null) {
			throw new Exception("The root should not be null");
		}
		
		insertHelper(root, null, element);
	}
	
	public static <T extends Comparable<T>> TreeNode<T> constructBST(T[] arr) throws Exception{
		if(arr.length == 0) {
			throw new Exception("The array should not be empty");
		}
		
		TreeNode<T> root = new TreeNode<T>(arr[0]);
		
		for(int i = 1; i < arr.length; i++) {
			insert(root, arr[i]);
		}
		
		return root;
	}
	
	public static <T extends Comparable<T>> void printValue(TreeNode<T> node) {
		System.out.println(node.getValue());
	}
	
	public static <T extends Comparable<T>> void inOrderWalk(TreeNode<T> root) {
		
		if(root == null) {
			return;
		}
		
		inOrderWalk(root.getLeft());
		printValue(root);
		inOrderWalk(root.getRight());
	}
	
	public static <T extends Comparable<T>> void preOrderWalk(TreeNode<T> root) {
		
		if(root == null) {
			return;
		}
		printValue(root);
		preOrderWalk(root.getLeft());
		preOrderWalk(root.getRight());
	}
		
	public static <T extends Comparable<T>> void postOrderWalk(TreeNode<T> root) {
		
		if(root == null) {
			return;
		}
		
		postOrderWalk(root.getLeft());
		postOrderWalk(root.getRight());
		printValue(root);
	}
	
	public static <T extends Comparable<T>> TreeNode<T> searchTree(TreeNode<T> root, T key) {
		
		if(root == null || root.getValue().compareTo(key) == 0) return root;
		
		if(root.getValue().compareTo(key) < 0) {
			return searchTree(root.getRight(), key);
		}
		return searchTree(root.getLeft(), key);
	}
	
	public static <T extends Comparable<T>> TreeNode<T> getMin(TreeNode<T> root) {
		
		while(root.getLeft() != null) {
			root = root.getLeft();
		}
		
		return root;
	}
	
	public static <T extends Comparable<T>> TreeNode<T> getMax(TreeNode<T> root) {
		
		while(root.getRight() != null) {
			root = root.getRight();
		}
		
		return root;
	}
}
