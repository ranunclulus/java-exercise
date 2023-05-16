package week5.day2;

import java.util.Arrays;

public class InsertionSort01 {
    public int[] sort(int[] arr, boolean isAscending) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if (isAscending? (arr[j] - arr[j - 1] < 0) : (arr[j] - arr[j - 1] > 0)) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else { break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {6, 4, 1, 7, 8, 9, 3};
        InsertionSort01 insertionSort = new InsertionSort01();
        arr = insertionSort.sort(arr, true);
        System.out.println(Arrays.toString(arr));
        arr = insertionSort.sort(arr, false);
        System.out.println(Arrays.toString(arr));
    }
}