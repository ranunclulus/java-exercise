package week10.day3;

public class TreeTraverse {
    private int nodes; // tree의 노드 개수
    private int[] arr; // 완전 이진 트리를 표현하기 위한 배열

    // {0, 1, 2, 3, 4, 5, 6, ...}
    public void setArr(int[] arr) {
        this.arr = arr;
        this.nodes = arr.length;
    }

    // 전위 순회 V -> L -> R
    // predorder(): V -> preorder(L) -> preorder(R)
    public void traversePreorder(int node) {
        System.out.println(arr[node] + ", "); // 방문
        this.traversePreorder(node * 2); // 왼쪽 노드를 기준으로 다시 호출
        this.traversePreorder(node * 2 + 1); // 오른쪽 노드를 기준으로 다시 호출
    }
}
