package algorithm;


import org.ahesh.types.DLNode;

import org.ahesh.types.Node;
import org.ahesh.types.TreeNode;

import myds.bst.BSTUtils;
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
		try {
			
			TreeNode<Integer> temp = BSTUtils.constructBST(new Integer[] {1, 2, 3, 4});
			
			while(temp.getRight() != null) {
				System.out.println("Value: " + temp.getValue());
				temp = temp.getRight();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
