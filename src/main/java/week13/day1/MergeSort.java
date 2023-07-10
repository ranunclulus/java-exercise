package week13.day1;

import java.util.Arrays;

public class MergeSort {
    public void sort(int[] arr) {
        // 비웠거나 길이가 1 이하라면 정렬 필요 없음
        if (arr == null || arr.length <= 1) {
            return;
        }
        mergeSort(arr, 0, arr.length -1);
    }

    public void mergeSort(
            int[] arr,
            int left,
            int right
    ) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public void merge(int[] arr, int left, int mid, int right) {
        // 왼쪽 배열과 오른쪽 배열의 크기
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // 배열을 복사한다
        int[] leftArr = Arrays.copyOfRange(arr, left, left + n1);
        int[] rightArr = Arrays.copyOfRange(arr, mid + 1, mid + 1 + n2);

        // 임시 배열 두 개를 앞쪽 원소부터 각각 비교하면서
        // 더 작은 원소를 원본 배열에 순서 대로 저장
        // 왼쪽 배열 index
        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            // 왼쪽 배열 값이 더 작거나 같을 때
            if(leftArr[i] <= rightArr[j]) {
                // 원본 배열에 저장 후
                arr[k] = leftArr[i];
                // 왼쪽 배열의 다음 원소 지정
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            // 원본 배열의 다음 저장 위치
            k++;
        }
        // 왼쪽 배열에 원소가 남았으면 마저 저장
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        // 오른쪽 배열에 원소가 남았으면 마저 저장
        while(j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 9, 2, 4, 7, 3, 6, 8};
        new MergeSort().sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
