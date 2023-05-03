package Programmers;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
public class FactorSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(12));
    }
}
