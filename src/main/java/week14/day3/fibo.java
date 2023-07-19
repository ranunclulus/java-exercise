package week14.day3;

public class fibo {
    // n을 입력받고 n번째 피보나치 수열 출력
    public int fiboRe(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        if(n == 0) return 0;
        return (fiboRe(n - 1) + fiboRe(n - 2));
    }

    public int fiboMemo(int n) {
        return fiboMemoRe(n, new int[n + 1]);
    }

    public int fiboMemoRe(int n, int[] memo) {
        if(n == 1 || n == 2) {
            return 1;
        }
        if(n == 0) return 0;
        else if (memo[n] == 0) // 만약 아직 없다면 이번에 구해서 기록
            memo[n] = fiboMemoRe(n - 1, memo) + fiboMemoRe(n - 2, memo);
        // memo[n] 이 있다면 해당 값이 지금 구하고 있는 n번째 피보나치 수열 값
        return memo[n];
    }


    public static void main(String[] args) {
        System.out.println(new fibo().fiboMemo(10));
    }
}
