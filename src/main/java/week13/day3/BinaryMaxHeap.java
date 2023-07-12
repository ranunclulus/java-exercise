package week13.day3;

public class BinaryMaxHeap {
    private int[] heap;
    private int size;

    public BinaryMaxHeap() {
        heap = new int[32];
        size = 0;
    }

    // 삽입 연산
    public void insert(int item) {
        heap[size] = item;
        // TODO 비교하며 끌어올리기
        reHeapUp(size);
        size++;

    }

    // index에 존재하는 원소를 자신의 부모와 비교해서
    // heap의 조건을 만족시키도록 교환을 반복적으로 진행하는 함수
    private void reHeapUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            // 힙의 조건 만족
            if (heap[index] <= heap[parentIndex]) break;
            // 아니면 교환
            int temp = heap[index];
            heap[index] = heap[parentIndex];
            heap[parentIndex] = temp;
        }
    }
}
