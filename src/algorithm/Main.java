package algorithm;

import myds.redblacktree.RBTUtils;
import myds.redblacktree.RBTree;
/**
 * 
 * @author aheshalagu
 */
public class Main {
	
	
	public static void main(String[] args) {
		
		try {
			Integer[] arr = {1, 2, 3, 4, 5};
			
			RBTree<Integer> tree = new RBTree<Integer>(arr);
//			System.out.print(tree.getRoot().getKey());
//			System.out.print(tree.getRoot().getLeft().getKey());
//			System.out.print(tree.getRoot().getRight().getKey());
//			System.out.print(tree.getRoot().getRight().getLeft().getKey());
//			System.out.print(tree.getRoot().getRight().getRight().getKey());
//			System.out.print(tree.getRoot().getRight().getRight().getRight() == tree.getNil());
			RBTUtils.bfsRbTree(tree);
//			RBTUtils.insert();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
