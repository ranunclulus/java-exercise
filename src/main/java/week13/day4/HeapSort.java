package week13.day4;

import java.util.Arrays;

public class HeapSort {
    public void sort(int[] arr){
        // 배열의 크기를 조사
        int size = arr.length;
        // 전체 배열을 힙의 형태로
        for (int i = 0; i < size / 2 - 1; i++) {
            heapify(arr, size, i);
        }
        // 정렬 안 된 마지막 노드랑 루트 노드를 교환해 가며 남은 원소들을 힙의 형태로 유지
        for (int i = size - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    // 본래 heap의 reHeapDown 연산과 동일한데 그 범위 한정
    // size: heap의 크기 한정
    private void heapify(int[] arr, int size, int index) {
        while(index < size) {
            int leftChild = index * 2 + 1;
            int rightChild = index * 2 + 2;
            int maxIndex = index;
            // 왼쪽 자식이 존재하며 왼쪽 자식이 현재 루트보다 클 때
            if (leftChild < size && arr[leftChild] > arr[maxIndex]) {
                maxIndex = leftChild;
            }
            // 오른쪽이 제일 크다면 갱신되었을 것
            if (rightChild < size && arr[rightChild] > arr[maxIndex]) {
                maxIndex = rightChild;
            }

            // 부모 인덱스가 제일 큰 경우는 힙 만족이라 조건
            if (maxIndex == index) break;

            int temp = arr[index];
            arr[index] = arr[maxIndex];
            arr[maxIndex] = temp;
            index = maxIndex;
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 4, 7, 1, 2, 6, 3};
        new HeapSort().sort(array);
        System.out.println(Arrays.toString(array));
    }
}
