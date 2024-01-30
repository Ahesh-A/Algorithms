import java.util.Arrays;

public class InsertionSortRec {
    public static void insert(int[] arr, int n) {
        int i = n - 1;
        int key = arr[n];
        while(i >= 0 && arr[i] > key) {
            arr[i + 1] = arr[i];
            i--;
        } 
        arr[i + 1] = key;
    }

    public static void insertionSort(int[] arr,int n) {
        if(n == 0) return;

        insertionSort(arr, n - 1);
        insert(arr, n);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 7, 5};
        insertionSort(arr, arr.length - 1);
        System.out.print(Arrays.toString(arr));
    }
}
