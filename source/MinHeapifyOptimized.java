import java.util.Arrays;

public class MinHeapifyOptimized {

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
     public static void main(String[] args) {
        int[] arr = {16, 4, 10, 14, 7, 9, 3, 2, 8, 1};
        minHeapify(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}
