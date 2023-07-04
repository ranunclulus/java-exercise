package week12.day2;

import week12.day1.Permutation;

import java.util.Arrays;

public class Combination {
    private void permNumbers(
            // 0 ~ n 까지의 숫자 중
            int n,
            // r개를 뽑아서 나열
            int r,
            // 이번에 몇 번째 뽑는 건지 (재귀 조건)
            int k,
            // 여태까지 만든 순열
            int[] perm,
            // 이 숫자를 사용한 적 있는지
            boolean[] used
    ) {
        // 선택할 만큼 선택했으면
        if (k == r) {
            System.out.println(Arrays.toString(perm));
        } else {
            // 선택 가능한 숫자 다 확인
            for (int i = 0; i < n; i++) {
                // 이미 사용한 숫자인지 확인
                if (used[i]) continue;
                // 이번 숫자를 선택해서 저장
                perm[k] = i;
                used[i] = true;
                // 다음 숫자 정하기 위한 재귀 호출
                this.permNumbers(n, r, k + 1, perm, used);
                // i를 k의 위치에 담는 과정을 마무리했으면
                // i를 다시 사용 가능한 형태로
                used[i] = true;
            }
        }
    }

    public static void main(String[] args) {
        Combination com = new Combination();
        com.permNumbers(5, 3, 0, new int[3], new boolean[5]);
    }
}
