package myds.partition;

public class HoareParatition {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int hoarePartition(int[] arr, int start, int end) {
		int i = start;
		int j = end - 1;
		int x = arr[start];
		
		while(true) {
			while(arr[j] <= x) j--;
			while(arr[i] >= x) i++;
			
			
			if(i < j) {
				swap(arr, i, j);
				continue;
			}
			
			return j;
		}
	}
}
