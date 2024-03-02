package myds.bst;

import org.ahesh.types.TreeNode;

public class BSTUtils {
	
	private static <T extends Comparable<T>> void insertHelper(TreeNode<T> root, TreeNode<T> parent, T element) {
		if(root == null) {
			return;
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
