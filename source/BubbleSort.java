import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = arr.length - 1; j >= i + 1; j--) {
                if(arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main (String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        bubbleSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
