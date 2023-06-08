package week8.day4;

import java.util.Arrays;

public class SelectionSort {
    public void selectionsort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {25, 12, 18, 24, 2, 21};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
