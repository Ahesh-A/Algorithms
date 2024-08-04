package myds.quicksort;

import java.util.List;

public class QuickSort {

	private static void swap(int i, int j, List<Integer> list) throws Exception {
		Integer iVal = list.get(i);
		Integer jVal = list.get(j);
		
		if(i == j || iVal.compareTo(jVal) == 0) {
			return;
		}
		
		Integer temp = iVal;
		list.set(i, jVal);
		list.set(j, temp);
	}
	
	public static int partition(int start, int end, List<Integer> list) throws Exception{
		int i = start - 1;
		
		int x = list.get(end);
		int j;
		for(j = start; j <= end; j++) {
			if(list.get(j).compareTo(x) <= 0) {
				System.out.println("inside if" + list.get(j) + " " + x);
				i++;
				swap(i, j, list);
			}
		}
		System.out.println("List: " + list);
		return i;
	}
	
	private static void quickSortHelper(int start, int end, List<Integer> list) throws Exception{
		
		if(start >= end) return;
		
		int pivot = partition(start, end, list);
		quickSortHelper(start, pivot - 1, list);
		quickSortHelper(pivot + 1, end, list);
	}
	
	public static void quickSort(List<Integer> list) throws Exception {
		quickSortHelper(0, list.size() - 1, list);
	}
}
