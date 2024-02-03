import java.util.Arrays;

public class HeapSort {

     public static void swap(int[] arr, int i, int j) {
        if(i == j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }

    public static void maxHeapify(int[] arr, int i, int length) {
        int temp = i ;

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

    public static void buildMaxHeap(int[] arr, int length) {
        int idx = length / 2 - 1;

        for(int i = idx; i >= 0; i--) {
            maxHeapify(arr, i, length);
        }
    }    

    public static void heapSort(int[] arr) {
        int length = arr.length;
        buildMaxHeap(arr, length);
        // System.out.println(Arrays.toString(arr));

        for(int i = length - 1; i > 0; i--) {
            swap(arr, 0, i);
            maxHeapify(arr, 0, i);       

        }

    }
    public static void main(String[] args) {
        int[] arr = {5, 13, 2, 25, 7, 17, 20, 8, 4};
        heapSort(arr);
        System.out.println("Result: " + Arrays.toString(arr));
    }
}