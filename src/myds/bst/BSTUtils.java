package myds.bst;

import org.ahesh.types.TreeNode;

public class BSTUtils {
	
	private static <T extends Comparable<T>> void insertChild(TreeNode<T> parent, T element) {
		if(parent.getValue().compareTo(element) < 0 ) {
			parent.setLeft(new TreeNode<T>(element));
			return;
		}
		
		parent.setRight(new TreeNode<T>(element));
		return;
	}
	
	private static <T extends Comparable<T>> void insertHelper(TreeNode<T> root, TreeNode<T> parent, T element) {
		if(root == null) {
			insertChild(parent, element);
		}
		
		if(root.getValue().compareTo(element) < 0) {
			insertHelper(root, root.getLeft(), element);
		}
			
	}
	
	public static <T extends Comparable<T>> void  insert(TreeNode<T> root, T element) throws Exception{
		if (root == null) {
			throw new Exception("The root is null");
		}
		
		insertHelper(root, root, element);
	}
	
	
}
