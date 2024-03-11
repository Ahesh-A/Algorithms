package myds.bst;


import org.ahesh.types.TreeNode;

public class BSTUtils {
	
	private static <T extends Comparable<T>> void insertChild(TreeNode<T> parent, T element) {
		
		TreeNode<T> child = new TreeNode<T> (element);
		child.setParent(parent);
		
		if(parent.getValue().compareTo(element) < 0 ) {
			parent.setRight(child);
			return;
		}
		
		parent.setLeft(child);
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
		if(root == null) return null;
		
		while(root.getLeft() != null) {
			root = root.getLeft();
		}
		
		return root;
	}
	
	public static <T extends Comparable<T>> TreeNode<T> getMax(TreeNode<T> root) {
		if(root == null) return null;
		
		while(root.getRight() != null) {
			root = root.getRight();
		}
		
		return root;
	}
	
	public static <T extends Comparable<T>> TreeNode<T> getSuccessor(TreeNode<T> node) {
		
		if(node == null) return null;
		
		if(node.getRight() != null) {
			return getMin(node.getRight());
		}
		
		TreeNode<T> temp = node.getParent();
		
		while(temp != null && node == temp.getRight()) {
			node = temp;
			temp = temp.getParent();
		}
		
		return temp;
	}
	
	public static <T extends Comparable<T>> TreeNode<T> getPredecessor(TreeNode<T> node) {
		if(node == null) return null;
		
		if(node.getLeft() != null) {
			return getMax(node.getLeft());
		}
		TreeNode<T> temp = node.getParent();
		while(temp != null && node == temp.getLeft()) {
			node = temp;
			temp = temp.getParent();
		}
		
		return temp;
	}
	
	private static <T extends Comparable<T>> boolean nodeHasSingleChild(TreeNode<T> node) {
		return node.getLeft() == null || node.getRight() == null;
	}
	
	private static <T extends Comparable<T>> TreeNode<T> getY(TreeNode<T> root, TreeNode<T> nodeToDelete) {
		if(nodeHasSingleChild(nodeToDelete)) {
			return nodeToDelete;
		}
		
		return getSuccessor(nodeToDelete);
	}
	
	private static <T extends Comparable<T>> TreeNode<T> getX(TreeNode<T> node) {
		if(node.getLeft() != null) return node.getLeft();
		return node.getRight();
	}
	
	private static <T extends Comparable<T>> void setParentOfXtoY(TreeNode<T> x, TreeNode<T> y) {
		x.setParent(y.getParent());
	}
	
	private static <T extends Comparable<T>> boolean isLeftChild(TreeNode<T> node) throws Exception{
		if(node == null) {
			throw new Exception("Node is null");
		}
		
		return node.getParent().getLeft() == node;
	}
	
	private static <T extends Comparable<T>> boolean isRightChild(TreeNode<T> node) throws Exception{
		if(node == null) {
			throw new Exception("Node is null");
		}
		
		return node.getParent().getRight() == node;
	}
	
	private static <T extends Comparable<T>> void attachX(TreeNode<T> x, TreeNode<T> y) {
		
		try {
			if(isLeftChild(y)) {
				System.out.println("yes");
				y.getParent().setLeft(x);
				return;
			}	
			y.getParent().setRight(x);
		} catch(Exception e) {
			System.out.println("Exception at attachX: " + e.getMessage());
		}
	}
	
	private static <T extends Comparable<T>> void attachXWithAncestor(TreeNode<T> root, TreeNode<T> x, TreeNode<T> y) {
		if(y.getParent() == null) {
			root = x;
			return;
		}
		
		attachX(x, y);
	}
	
	private static <T extends Comparable<T>> void copyData(TreeNode<T> nodeToDelete, TreeNode<T> y) {
		nodeToDelete.setValue(y.getValue());
		
	}
	
	public static <T extends Comparable<T>> TreeNode<T> deleteNode(TreeNode<T> root, TreeNode<T> nodeToDelete) {
		
		TreeNode<T> y = getY(root, nodeToDelete);
		System.out.println("Value of Y: " + y.getValue());
		TreeNode<T> x = getX(y);
		
		if(x != null) {
			setParentOfXtoY(x, y);
		}
		
		attachXWithAncestor(root, x, y);
		
		if(y != nodeToDelete) {
			copyData(nodeToDelete, y);
		}
		
		return y;
	}
}
