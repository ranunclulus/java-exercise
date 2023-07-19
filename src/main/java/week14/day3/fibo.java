package week14.day3;

public class fibo {
    // n을 입력받고 n번째 피보나치 수열 출력
    public int fiboSimple(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        if(n == 0) return 0;
        return (fiboSimple(n - 1) + fiboSimple(n - 2));
    }

    public static void main(String[] args) {
        System.out.println(new fibo().fiboSimple(10));
    }
}
