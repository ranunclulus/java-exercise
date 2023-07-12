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
            index = parentIndex;
        }
    }

    // 삭제 연산
    public int remove() {
        // 루트 노드 제거
        int root = heap[0];
        // 마지막 자식 할당
        heap[0] = heap[size - 1];
        size--;
        // TODO 아래로 끌어내리기
        reHeapDown(0);
        return root;
    }

    private void reHeapDown(int index) {
        while(index < size) {
            int leftChild = index * 2 + 1;
            int rightChild = index * 2 + 2;
            int maxIndex = index;
            // 왼쪽 자식이 존재하며 왼쪽 자식이 현재 루트보다 클 때
            if (leftChild < size && heap[leftChild] > heap[maxIndex]) {
                maxIndex = leftChild;
            }
            // 오른쪽이 제일 크다면 갱신되었을 것
            if (rightChild < size && heap[rightChild] > heap[maxIndex]) {
                maxIndex = rightChild;
            }

            // 부모 인덱스가 제일 큰 경우는 힙 만족이라 조건
            if (maxIndex == index) break;

            int temp = heap[index];
            heap[index] = heap[maxIndex];
            heap[maxIndex] = temp;
            index = maxIndex;
        }
    }

    public static void main(String[] args) {
        BinaryMaxHeap binaryMaxHeap = new BinaryMaxHeap();
        for (int i = 0; i < 32; i++) {
            binaryMaxHeap.insert(i);
        }
        for (int i = 0; i < 32; i++) {
            System.out.println(binaryMaxHeap.remove());
        }
    }

}
