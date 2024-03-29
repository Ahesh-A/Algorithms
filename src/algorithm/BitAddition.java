package algorithm;

public class BitAddition {

    public int[] addBit(int[] a, int[] b) {
        int length = a.length;
        int[] result = new int[length + 1];
        int rem = 0;

        for(int i = length - 1; i >= 0; i--) {
            int sum = a[i] + b[i] + rem;
            result[i + 1] = sum % 2;
            rem = sum / 2;
        }

        result[0] = rem;
        return result;
    }
}

