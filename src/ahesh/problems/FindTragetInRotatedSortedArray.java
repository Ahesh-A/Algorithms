package ahesh.problems;

public class FindTragetInRotatedSortedArray {
	
	
	
	public static int findTraget(int[] arr, int target, int start, int end) {
		
		if(start > end) return -1;
		
		int mid = start + (end - start) / 2;
		
		if(arr[mid] == target) {
			return mid;
		}
		if(arr[start] <= arr[mid]) {
			if(target <= arr[mid] && target >= arr[start]) {
				return findTraget(arr, target, start, mid);
			}
			return findTraget(arr, target, mid + 1, end);
		}
		if(target >= arr[mid] && target <= arr[end]) {	
			return findTraget(arr, target, mid, end);
		}
		return findTraget(arr, target, start, mid - 1);
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {4, 5, 6, 1, 2, 3};
		int result = findTraget(arr, -1, 0, arr.length - 1);
		System.out.println("Result: " + result);
	}

}
