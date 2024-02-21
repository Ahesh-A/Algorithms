package algorithm;

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

import myds.stack.Stack;
/**
 * 
 * @author aheshalagu
 */
public class Main {
	
	public static void main(String[] args) {
		
		try {
			Stack<Integer> stack = new Stack<>(10);
			
			for(int i = 0; i < 10; i++) {
				stack.push(i);
			}
			
			for(int i = 0; i < 10; i++) {
				System.out.println(stack.pop());
			}
//			System.out.println(stack);
		} catch(Exception e) {
			System.out.println("Error :" + e);
		}
		

	}
}
