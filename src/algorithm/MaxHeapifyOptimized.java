package algorithm;

public class MaxHeapifyOptimized {

        public  void swap(int[] arr, int i, int j) {
        if(i == j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }

    public  void maxHeapifyOptimized(int[] arr, int i) {
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
}
