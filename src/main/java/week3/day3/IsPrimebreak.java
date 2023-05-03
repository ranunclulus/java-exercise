package week3.day3;

public class IsPrimebreak {
    public static void main(String[] args) {
        int num = 992;
        boolean isprime = true;
        for (int i = 2; i * i <= num ; i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            }
        }
        System.out.println("isprime = " + isprime);
    }
}
// 소수가 아니라고 판별되면 바로 프로그램을 종료해서 더 효율적인 계산
