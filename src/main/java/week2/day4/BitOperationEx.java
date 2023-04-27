package week2.day4;

public class BitOperationEx {
    public static void main(String[] args) {
        int iVal1 = 1;
        System.out.println(iVal1 << 1); // 비트 연산자
        System.out.println(iVal1 >> 1);
        System.out.println(iVal1 << 6);
        // 두 배 단위로 곱하거나 나눌 때는 비트 연산이 더 빠르다
    }
}
