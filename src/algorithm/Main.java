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
			
			BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>(new Integer[] {6, 4, 8, 4, 5, 7} );
			
			TreeNode<Integer> temp = tree.getRoot();
			BSTUtils.inOrderWalk(temp);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
