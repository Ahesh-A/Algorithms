import java.util.Arrays;
public class SelectionSort {
    public static void selectionSort(int[] arr) {
    
        for(int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[minIdx] > arr[j]) minIdx = j;
            }
            
            if(i != minIdx) {
                arr[i] = arr[i] + arr[minIdx];
                arr[minIdx] = arr[i] - arr[minIdx];
                arr[i] = arr[i] - arr[minIdx]; 
            }
        
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 7, 6};
        selectionSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}