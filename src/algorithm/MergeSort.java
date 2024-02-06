package algorithm;

public class MergeSort{
    public  void merge(int[] arr, int start, int mid, int end){
        int i = start;
        int j = mid + 1;
        int k = 0;
        int[] dupArr = new int[end - start + 1];

        while(i <= mid && j <= end) {
            if(arr[i] < arr[j]) dupArr[k++] = arr[i++];
            else dupArr[k++] = arr[j++];
        }

        while(i <= mid) {
            dupArr[k++] = arr[i++];
        } 

        while( j <= end) {
            dupArr[k++] = arr[j++];
        } 

        for(i = start; i <= end; i++) {
            arr[i] = dupArr[i - start];
        }
    }

    public  void mergeSort(int[] arr, int start, int end) {
        if(start == end) return;
        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }
}
