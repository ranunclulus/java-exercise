package CodeUp;

import java.util.Scanner;

public class CodeUp1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long m = sc.nextInt();
        long d = sc.nextInt();
        long n = sc.nextInt();
        long result = a;
        for (int i = 0; i < n - 1; i++) {
            result = result * m + d;
        }
        System.out.println(result);
    }
}
