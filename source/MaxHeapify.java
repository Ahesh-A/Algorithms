import java.util.Arrays;

public class MaxHeapify {
    public static void swap(int[] arr, int i, int j) {
        if(i == j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }

    public static void maxHeapify(int[] arr, int i) {
        int left = 2 * i + 1;
        int right = 2 * (i + 1) ;
        int length = arr.length;
        int largest = i;

        if(left < length && arr[left] > arr[i]) {
            largest = left;
        }

        if(right < length && arr[right] > arr[largest]) {
            largest = right;
        }

        if(largest != i) {
            swap(arr, i, largest);
            maxHeapify(arr, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {16, 4, 10, 14, 7, 9, 3, 2, 8, 1};
        maxHeapify(arr, 1);
        System.out.println(Arrays.toString(arr));
    }
}
