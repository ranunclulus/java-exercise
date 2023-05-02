package CodeUp;

import java.math.BigDecimal;
import java.util.Scanner;

public class CodeUp1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = sc.nextInt();
        long answer = h * b * c * s;
        System.out.printf("%.1f MB", (((answer / 8.0) / 1024) / 1024));
    }
}
