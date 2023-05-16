package week5.day2;

import java.util.Arrays;

public class SelectionSort01 {
    public static void main(String[] args) {
        int[] arr = {55, 64, 21, 643, 23, 84};

        for (int i = 0; i < arr.length - 1; i++) {
            int targetValue = arr[i];
            for (int j = i; j < arr.length; j++) {
                if(targetValue > arr[j]) {
                    targetValue = arr[j];
                    arr[j] = arr[i];
                }
            }
            arr[i] = targetValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}
