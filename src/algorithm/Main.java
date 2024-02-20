package algorithm;

//import java.util.Arrays;

import org.ahesh.types.Node;
import myds.linkedlist.LinkedList;
//import java.util.List;
//import myds.countsort.CountSort;
//import myds.radixsort.RadixSort;
//import myds.stoogesort.StoogeSort;
//import myds.quicksort.QuickSort;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import myds.heap.MinHeap;

/**
 * 
 * @author aheshalagu
 */
public class Main {
	
	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>();
		Node<Integer> temp = head;
		
		for(int i = 0; i < 10; i++) {
			Node<Integer> node = new Node<>(i);
			temp.setNext(node);
			temp = temp.next();
		}
		
		LinkedList<Integer> list = new LinkedList<>(head.next());
		list.printList(head.next());
	}
}
