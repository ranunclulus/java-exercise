package week13.day2;

public class BinarySearchAlgorithm {
    public int binarySearch(int[] arr, int target) {
        // 검색 범위를 한정하는 left와 right
        int left = 0;
        int right = arr.length - 1;

        // 왼쪽 인덱스가 오른쪽보다 커지면 실패
        while(left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return mid;
            if(arr[mid] > target) right = mid - 1;
            if(arr[mid] < target) left = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 2;
        int index = new BinarySearchAlgorithm().binarySearch(arr, target);

        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("탐색 실패");
        }
    }
}
