package week12.day1;

public class Permutation {
    public static void main(String[] args) {
        // 0과 2 사이의 3개의 숫자가 있다
        // 겹치지 않도록 3개를 골라 나열한 모든 경우의 수를 출력해 보자
        // 1. 첫 번쨰 숫자를 for 반복으로 구한다
        for (int i = 0; i < 3; i++) {
            // 2. 두 번째 숫자를 for 반복으로 구한다
            for (int j = 0; j < 3; j++) {
                if(i == j) continue;
                for (int k = 0; k < 3; k++) {
                    // 3. 세 번째 숫자를 for 반복으로 구한다.
                    if (i == k || j == k) continue;
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
        // 5개의 숫자를 담은 int[]에서 3개를 골라 나열해보자.
        int[] numbers = new int[] {10, 12, 14, 16, 18};
        for (int i = 0; i < 5; i++) {
            // 2. 두 번째 숫자를 for 반복으로 구한다
            for (int j = 0; j < 5; j++) {
                if(i == j) continue;
                for (int k = 0; k < 5; k++) {
                    // 3. 세 번째 숫자를 for 반복으로 구한다.
                    if (i == k || j == k) continue;
                    System.out.println(numbers[i] + " " + numbers[j] + " " + numbers[k]);
                }
            }
        }

        // 0과 4 사이로 바꾼다면
        for (int i = 0; i < 5; i++) {
            // 2. 두 번째 숫자를 for 반복으로 구한다
            for (int j = 0; j < 5; j++) {
                if(i == j) continue;
                for (int k = 0; k < 5; k++) {
                    // 3. 세 번째 숫자를 for 반복으로 구한다.
                    if (i == k || j == k) continue;
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }
}
