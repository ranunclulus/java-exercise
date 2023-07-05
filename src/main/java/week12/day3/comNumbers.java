package week12.day3;

import java.util.Arrays;

public class comNumbers {
    private void comNumbers(
            //nCr
            int n, int r,
            // 지금까지 고른 원소의 개수
            int k,
            // 현재 조합에 포함시킬지 고려 중인 숫자
            int next,
            // 작성 중인 조합
            int[] comb
    ) {
        // 고를 만큼 골랐다
        if (k == r) System.out.println(Arrays.toString(comb));
        else if (next == n) {
            // 조합 생성 실패
            // 아직 다 안 골랐는데 더 이상 고를 숫자가 없음
            return;
        }
        else {
            // 현재 만드는 조합에 k 번째 next를 넣는다
            comb[k] = next;
            // k + 1 번째에 next + 1 을 할당할지 말지를 결정하러 재귀 호출
            comNumbers(n, r, k + 1, next + 1, comb);
            // next를 선택하지 않았다면, k 반복에 next + 1을 할당할지 말지를 결정하러 재귀 호출
            // 이때 comb[k] = next에서 할당한 값이 덮어씌워진다
            comNumbers(n, r, k, next + 1, comb);
        }
    }
    public static void main(String[] args) {
        new comNumbers().comNumbers(
                5,
                3,
                0,
                0,
                new int[3]
        );
    }
}
