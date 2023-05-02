package week4.day2;

import java.util.Scanner;

public class NFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nVal = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= nVal; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
