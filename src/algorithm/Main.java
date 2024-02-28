package algorithm;


import org.ahesh.types.DLNode;
import org.ahesh.types.Node;

import myds.linkedlist.DLCLL;

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
		DLNode<Integer> temp = dlcll.getHead().getNext();
		
		while(temp != null) {
			System.out.println(temp.getValue());
			temp = temp.getNext();
		}
	}
}
