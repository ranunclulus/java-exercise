package week3.day2;

import java.util.Scanner;

public class ZeroOrFive {
    public static boolean isZeroOrFive(int num) {
        while (num > 0) {
            int remainder = num % 10;
            if (remainder % 5 != 0) {
                return false;
            }
            System.out.println(remainder % 5);
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 253;
        System.out.printf("%d는 5와 0으로만 구성되었나요? %b\n", num, isZeroOrFive(num));

    }
}
