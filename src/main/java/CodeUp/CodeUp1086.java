package CodeUp;

import java.util.Scanner;

public class CodeUp1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long s = sc.nextLong();
        long answer = h * b * c * s;
        double mb = answer / 8.0 / 1024 / 1024;
        System.out.printf("%.1f MB", mb);
    }
}
