package algorithm;


import org.ahesh.types.Node;

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
		LinkedList<Integer> list = new LinkedList<Integer>(new Integer[] {1, 2, 3, 4, 5});
		
//		Node<Integer> elem = LinkedListUtils.searchList(list, 2);
		
		LinkedListUtils.deleteList(list, 3);
		LinkedListUtils.printList(list);
	}
}
