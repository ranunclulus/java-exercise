package week13.day2;

import java.util.Arrays;

public class QuickSort {
    public void sort(int[] arr) {
        // 비었거나 길이가 1 이하라면 정렬할 필요 없다
        if (arr == null || arr.length <= 1) return;
        quickSort(arr, 0, arr.length - 1);
    }
    private void quickSort(int[] arr, int low, int high) {
        // low == high인 경우 이미 끝까지 다 정렬 완료
        if (low < high) {
            // quickSort후 나누어진 index 반환
            int pivot = partition(arr, low, high);

            // 해당 index를 기준으로 좌우에 대하여 다시
            // quickSort 호출
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }
    // pivot을 정하고 pivot이 최종적으로 위치하는 곳을 반환
    // pivot을 기준으로 좌우 배열의 원소들을 배열한 뒤 자신의 위치 반환
    private int partition(int[] arr, int low, int high) {
        // 오른쪽 끝이 pivot
        int pivot = arr[high];
        // 작은 원소가 들어갈 위치를 지정하는 i
        int i = low - 1;
        // j == low부터 high - 1까지 반복 (pivot 제외 전부 대조)
        for (int j = low; j < high; j++) {
            // 현재 원소의 값이 pivot보다 작은 경우
            if (arr[j] <= pivot) {
                i++;
                // 왼쪽 끝으로 보낸다
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // 이 과정이 끝나면 arr[i]에는 pivot보다 작은 원소가
        // i + 1 ~ high - 1의 원소는 pivot보다 큰 원소가 담긴다
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // 마지막으로 pivot의 위치를 반환
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {9, 3, 1, 7, 4, 8, 6, 2, 5};
        new QuickSort().sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
