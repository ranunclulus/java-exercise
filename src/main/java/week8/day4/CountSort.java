package week8.day4;

import java.util.Arrays;

public class CountSort {
    public int[] countsort(int[] arr) {
        int n = arr.length;

        int max = 5;
        int min = 0;
        int k = max - min + 1;

        int[] counts = new int[k];

        for(int data: arr) {
            counts[data]++;
        }

        for (int i = 0; i < k - 1; i++) {
            counts[i + 1] += counts[i];
        }

        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            counts[arr[i]]--;
            int position = counts[arr[i]];
            output[position] = arr[i];
        }
        return output;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 3, 0, 5, 2, 5, 1};
        CountSort countSort = new CountSort();
        int[] output = countSort.countsort(arr);
        System.out.println(Arrays.toString(output));
    }
}
