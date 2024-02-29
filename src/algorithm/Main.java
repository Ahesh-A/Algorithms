package algorithm;


import org.ahesh.types.DLNode;

import org.ahesh.types.Node;

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
		DLCLL<Integer> dlcll = new DLCLL<>(new Integer[] {1, 2, 3});
		
		DLCLLUtils.addElement(dlcll, new DLNode<Integer> (4));
		DLCLLUtils.printList(dlcll);
		DLCLLUtils.listDelete(dlcll, dlcll.getHead().getPrev().getPrev());
		DLCLLUtils.printList(dlcll);
	}
}
