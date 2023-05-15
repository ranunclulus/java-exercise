package week5.day1;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort02 {
    public int[] sort (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            arr = sortARound(arr, i);
        }
        return arr;
    }

    public int[] sortARound(int[] arr, int until) {
        for (int j = 0; j < arr.length - 1 - until; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 2, 88, 4, 56};
        BubbleSort02 bubbleSort = new BubbleSort02();

        arr = bubbleSort.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}