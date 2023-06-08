package week8.day4;

import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public void BuubleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {36, 12, 18, 15, 41, 19};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.BuubleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
