package week12.day5;

import java.util.Arrays;

public class SelectionSortRecursive {
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
        System.out.println(Arrays.toString(arr));
    }

    private void selectionsortRecursive (int[] arr, int start) {
        if (start == arr.length) return;
        int minIndex = start;
        for(int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) minIndex = i;
        }

        int temp = arr[start];
        arr[start] = arr[minIndex];
        arr[minIndex] = temp;

        // 남은 영역에 대해서 똑같은 작업을 한다
        selectionsortRecursive(arr, start + 1);
    }
}
