package algorithm;

public class BuildMaxHeap {
    
    public static void swap(int[] arr, int i, int j) {
        if(i == j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }

    public static void maxHeapify(int[] arr, int i) {
        int temp = i ;
        int length = arr.length;

        while(2 * temp + 1  < length) {
            int left = 2 * temp + 1;
            int right = 2 * (temp + 1);
            int target = temp;

            if(left < length && arr[left] > arr[temp]) {
                target = left;    
            }

            if(right < length && arr[right] > arr[target]) {
                target = right;
            }

            if(target == temp) {
                break;
            } 

            swap(arr, temp, target);
            temp = target;

        }
    }

    public static void buildMaxHeap(int[] arr) {
        int length = arr.length;
        int idx = length / 2 - 1;

        for(int i = idx; i >= 0; i--) {
            maxHeapify(arr, i);
        }
    }
}
