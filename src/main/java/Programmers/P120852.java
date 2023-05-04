package Programmers;

import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int divisor = 2;
        int[] arr = new int[n + 1];
        int idx = 0;
        while (n > 1) {
            if (n % divisor == 0) {
                arr[idx++] = divisor;
                n /= divisor;
            }
            else {
                divisor++;
            }
        }

        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                System.out.println(size);
            }
        }

        int[] answer = new int[size];
        idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                answer[idx++] = arr[i];
            }
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}

public class P120852 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(24));
    }
}
