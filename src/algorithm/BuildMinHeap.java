package algorithm;

public class BuildMinHeap {
     public static void swap(int[] arr, int i, int j) {
        if(i == j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }
    
    public static void minHeapify(int[] arr, int i) {
        int length = arr.length;
        int temp = i;
        int target = temp;

        while(2 * temp + 1 < length) {
            int left = 2 * temp + 1;
            int right = 2 * (temp + 1);
 
            if(left < length && arr[left] < arr[temp]) {
                target = left;
            }

            if(right < length && arr[right] < arr[target]) {
                target = right;
            }

            if(target == temp) {
                break;
            }

            swap(arr, target, temp);
            temp = target;
        }
    }

    public static void buildMinHeap(int[] arr) {
        int length = arr.length;

        for(int i = length / 2 - 1; i >= 0; i--) {
            minHeapify(arr, i);
        }
    }
}