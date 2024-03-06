package algorithm;


import org.ahesh.types.DLNode;

import org.ahesh.types.Node;
import org.ahesh.types.TreeNode;

import myds.bst.BSTUtils;
import myds.bst.BinarySearchTree;
import myds.linkedlist.DLCLL;
import myds.linkedlist.DLCLLUtils;
import myds.linkedlist.LinkedList;
import myds.linkedlist.LinkedListUtils;

//import java.util.Arrays;

//import org.ahesh.types.Node;
//import myds.linkedlist.LinkedList;
//import java.util.List;
//import myds.countsort.CountSort;
//import myds.radixsort.RadixSort;
//import myds.stoogesort.StoogeSort;
//import myds.quicksort.QuickSort;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import myds.heap.MinHeap;

import myds.queue.Queue;
/**
 * 
 * @author aheshalagu
 */
public class Main {
	
	
	public static void main(String[] args) {
//		System.out.println("Success");
		try {
			
			BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>(new Integer[] {15, 6, 18, 3, 7, 17, 20, 2, 4, 13, 9} );
			
			TreeNode<Integer> temp = tree.getRoot();
			TreeNode<Integer> res = BSTUtils.searchTree(temp, 13);
//			TreeNode<Integer> node = BSTUtils.getMax(temp);
//			
			TreeNode<Integer> predecessor = BSTUtils.getPredecessor(res);
			System.out.println("Value: " + predecessor.getValue());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
