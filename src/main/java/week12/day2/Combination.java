package week12.day2;

public class Combination {
    public static void main(String[] args) {
        int n = 5;
        // r은 3이라고 가정
        // i는 0부터 n-2 까지 반복해야 나머지 두 숫자를 고를 수 있음
        for (int i = 0; i < n - 2; i++) {
            // j도 최소한 하나의 숫자는 남겨 둬야 나머지 한 숫자를 마저 고를 수 있음
            for (int j = i + 1; j < n - 1; j++) {
                // k는 선택할 수 있는 나마ㅓ지 중 하나 선택
                for (int k = j + 1; k < n; k++) {
                    System.out.printf("%d %d %d \n", i, j, k);
                }
            }
        }
    }
}
