package algorithm;

import java.util.Arrays;
import java.util.List;

import myds.countsort.CountSort;
import myds.quicksort.QuickSort;

import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;

//import myds.heap.MinHeap;
/**
 * 
 * @author aheshalagu
 */
public class Main {
	/**
	 *  This is a test program
	 * @param args
	 */
	public static void main(String[] args) {
//		List<Integer> arr =  new ArrayList<>(Arrays.asList(new Integer[]{16, 10, 14, 8, 9, 4, 2, 7, 3, 1}));
//		try {
//			QuickSort.quickSort(arr);
//			System.out.println("List: " + arr);
//		} catch(Exception e) {
//			System.out.println("Error");
//			 e.printStackTrace();
//		}
		CountSort cs = new CountSort(9, new int[] {0, 1, 3, 3, 2, 7, 8, 9, 1, 2, 4, 3, 5, 6, 7, 7, 7, 8, 1, 3});
		System.out.println(Arrays.toString(cs.sort()));
	}
}
