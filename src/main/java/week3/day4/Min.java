package week3.day4;

public class Min {
    public static void main(String[] args) {
        int[] arr = {2, 1, 31, 9, 7};
        int targetValue = arr[0];
        for (int i = 0; i < 5; i++) {
            targetValue = (targetValue > arr[i]) ? arr[i] : targetValue;
        }
        System.out.println(targetValue);
    }
}
