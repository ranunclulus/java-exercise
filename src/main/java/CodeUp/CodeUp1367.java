package CodeUp;

import java.util.Scanner;

public class CodeUp1367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "";
        for (int i = 0; i < n; i++) {
            star += "*";
        }
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0 ; j--) {
                System.out.printf(" ");
            }
            System.out.println(star);
        }
    }
}
