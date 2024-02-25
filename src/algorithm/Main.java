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

import myds.queue.Queue;
/**
 * 
 * @author aheshalagu
 */
public class Main {
	
	public static void main(String[] args) {
		
		try {
			Queue<Integer> queue = new Queue<Integer>(11);
			
			for(int i = 0; i < 11; i++) {
				queue.offer(i);
				
				System.out.println("Queue: " + queue);
				System.out.println("Head: " + queue.gethead());
				System.out.println("Tail: " + queue.gettail());
			}
			
			System.out.println("-------------------------------------------------------------");
			
			for(int i = 0; i < 11; i++) {
				queue.poll();
				
				System.out.println("Queue: " + queue);
				System.out.println("Head: " + queue.gethead());
				System.out.println("Tail: " + queue.gettail());
			}
			
		} catch(Exception e) {
			System.out.println("Error :" + e);
		}
		
	}
}
