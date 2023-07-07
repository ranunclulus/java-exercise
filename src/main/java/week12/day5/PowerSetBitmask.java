package week12.day5;

import java.util.ArrayList;
import java.util.List;

public class PowerSetBitmask {
    public static void main(String[] args) {
        int[] set = {2, 3, 5};
        new PowerSetBitmask().powerSet(set);
    }
    public void powerSet(int[] set) {
        int n = set.length;
        // 집합의 부분 집합의 갯수는 2^n개인데, 1 << n 의 결과도 2^n
        int subsetCount = 1 << n;
        // i를 이진수로 생각하면
        // 각 자릿수가 1일 때 해당 자릿수 번째 원소를 고른다고 가정
        for (int i = 0; i < subsetCount; i++) {
            List<Integer> subset = new ArrayList<>();
            // n 개의 원소를 판단하기 위해 n번 반복
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0)
                    subset.add(set[j]);
            }
            System.out.println(subset);
        }
    }
}
