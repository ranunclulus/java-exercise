package week13.day4;

import java.util.Arrays;

public class HeapSort {
    public void sort(int[] arr){
        // 배열의 크기를 조사
        // 전체 배열을 힙의 형태로
        // 정렬 안 된 마지막 노드랑 루트 노드를 교환해 가며 남은 원소들을 힙의 형태로 유지
    }

    public static void main(String[] args) {
        int[] array = {9, 4, 7, 1, 2, 6, 3};
        new HeapSort().sort(array);
        System.out.println(Arrays.toString(array));
    }
}
