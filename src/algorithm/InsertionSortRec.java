package algorithm;

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

    public void insertionSort(int[] arr,int n) {
        if(n == 0) return;

        insertionSort(arr, n - 1);
        insert(arr, n);
    }
}
