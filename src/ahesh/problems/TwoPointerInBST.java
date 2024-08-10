package ahesh.problems;

import java.util.HashSet;
import java.util.Set;
import org.ahesh.types.TreeNode;
import myds.binarysearchtree.*;

public class TwoPointerInBST {
	
	public static boolean findTargetHelper(TreeNode<Integer> root, int k, Set<Integer> set) {
		
		if(root == null) {
			return false;
		}
		
		Integer val = root.getValue();
		
		if(set.contains(k - val)) {
			return true;
		}
		
		set.add(val);
		
		return findTargetHelper(root.getLeft(), k, set) || findTargetHelper(root.getRight(), k, set);
	}
	
	public static boolean findTarget(TreeNode<Integer> root, int k) {
		Set<Integer> set = new HashSet<>();
		
		return findTargetHelper(root, k, set);
    }

	public static TreeNode<Integer> getBST(Integer[] arr) throws Exception {
		TreeNode<Integer> root = BSTUtils.constructBST(arr);
		
		return root;
	}
	
	public static void main(String[] args) throws Exception {
		Integer[] arr = {5,3,6,2,4,7};
		TreeNode<Integer> root = getBST(arr);
		
		
		System.out.println("Result: " + findTarget(root, 7));
		
	}
}
