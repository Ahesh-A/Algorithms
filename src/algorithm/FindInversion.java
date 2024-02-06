package algorithm;

public class FindInversion {

    private void copyElements(int[] arr, int[] tempArr, int start, int end) {
        if((end - start + 1) != tempArr.length) return;

        for(int i = start; i <= end; i++) {
            arr[i] = tempArr[i - start];
        } 
    }    

    
    private int getInversionCountByRange(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int sum = 0;
        int k = 0;
        int[] tempArr = new int[end -start + 1];

        while(i <= mid && j <= end) {
            if(arr[i] < arr[j]) {
                tempArr[k++] = arr[i++];        
                
            } else {
                tempArr[k++] = arr[j++];
                sum += mid - i + 1;
            }
        }

        while(i <= mid) arr[i++] = tempArr[k++];
        while(j <= end) arr[j++] = tempArr[k++];

        copyElements(arr, tempArr, start, end);

        return sum;

    }

    public int findInversion(int[] arr, int start, int end) {
        if( start == end ) return 0;
        int sum = 0;
        int mid = start + (end - start) / 2;
        sum += findInversion(arr, start, mid);
        sum += findInversion(arr, mid + 1, end);
        sum += getInversionCountByRange(arr, start, mid, end);

        System.out.println(sum);
        return sum;
                
    }

}
