package algorithm;

public class MinHeapify {
    public  void swap(int[] arr, int i, int j) {
        if(i == j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }

    public  void minHeapify(int[] arr, int i) {
        int left = 2 * i + 1;
        int right = 2 * (i + 1);
        int length = arr.length;
        int target = i;

        if(left < length && arr[left] < arr[i]) {
            target = left;
        }

        if(right < length && arr[right] < arr[target]) {
            target = right;
        }

        if(i != target) {
            swap(arr, i, target);
            minHeapify(arr, target);
        }
    }
}

